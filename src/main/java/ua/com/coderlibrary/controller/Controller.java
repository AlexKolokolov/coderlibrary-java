package ua.com.coderlibrary.controller;


import ua.com.coderlibrary.dao.DAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.coderlibrary.model.Book;
import ua.com.coderlibrary.model.Course;
import ua.com.coderlibrary.model.Site;

import java.util.ArrayList;
import java.util.List;

/**
 * Синглтоновый контроллер, который обращается к DAO по запросам от сервлетов
 * и возвращает сервлетам необходимые данные.
 */
public class Controller {
    private static Controller instance;
    private DAO dao;

    private Controller() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springConfig.xml"});
        dao = (DAO)context.getBean("dao");
    }

    public static Controller getInstance() {
        if (instance == null) instance = new Controller();
        return instance;
    }

    public List getBooks(int page, int pageSize) {
        int firstBook = (page - 1) * pageSize;
        return dao.getBooksDesc(firstBook, pageSize);
    }

    public List getBooks(int booksNum) {
        return dao.getBooksDesc(0, booksNum);
    }

    public List getCourses(int page, int pageSize) {
        int firstCourse = (page - 1) * pageSize;
        return dao.getCoursesDesc(firstCourse, pageSize);
    }

    public  List getCourses(int coursesNum) {
        return dao.getCoursesDesc(0, coursesNum);
    }

    public  List getSites(int page, int pageSize) {
        int firstSite = (page - 1) * pageSize;
        return dao.getSitesDesc(firstSite, pageSize);
    }

    public  List getSites(int sitesNum) {
        return dao.getSitesDesc(0, sitesNum);
    }

    public long getBooksNum() {
        return dao.getBooksNum();
    }

    public long getCoursesNum() {
        return dao.getCoursesNum();
    }

    public long getSitesNum() {
        return dao.getSitesNum();
    }
}
