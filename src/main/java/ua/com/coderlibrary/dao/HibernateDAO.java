package ua.com.coderlibrary.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.coderlibrary.model.Book;
import ua.com.coderlibrary.model.Course;
import ua.com.coderlibrary.model.Site;


import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса DAO с применение Spring и Hibernate Criteria.
 */
@Repository
public class HibernateDAO implements DAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public long getBooksNum() {
        return getEntitiesNum(Book.class);
    }

    @Transactional
    @Override
    public long getCoursesNum() {
        return getEntitiesNum(Course.class);
    }

    @Transactional
    @Override
    public long getSitesNum() {
        return getEntitiesNum(Site.class);
    }

    @Transactional
    @Override
    public List getBooksDesc(int firstBook, int booksNum) {
        return getEntitiesDesc(Book.class, firstBook, booksNum);
    }

    @Transactional
    @Override
    public List getCoursesDesc(int firstCourse, int coursesNum) {
        return getEntitiesDesc(Course.class, firstCourse, coursesNum);
    }

    @Transactional
    @Override
    public List getSitesDesc(int firstSite, int sitesNum) {
        return getEntitiesDesc(Site.class, firstSite, sitesNum);
    }

    private List<?> getEntitiesDesc(Class entityClass, int firstElement, int elementsNum) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(entityClass);
        criteria.addOrder(Order.desc("id"));
        criteria.setFirstResult(firstElement);
        criteria.setMaxResults(elementsNum);
        return criteria.list();
    }

    private long getEntitiesNum(Class entityClass) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(entityClass);
        criteria.setProjection(Projections.rowCount());
        return (long) criteria.uniqueResult();
    }

}
