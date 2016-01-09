package ua.com.coderlibrary.dao;

import java.util.List;

/**
 * Интерфейс DAO. Перечень методов, которы извлекают из базы необходимые сервлетам данные.
 */
public interface DAO {

    /**
     * Выдает общее колличество книг в БД.
     */
    long getBooksNum();

    /**
     * Выдает общее колличество видеокурсов в БД.
     */
    long getCoursesNum();

    /**
     * Выдает общее колличество сайтов в БД.
     */
    long getSitesNum();

    /**
     * Выдает перечень книг в порядке, обратном размещению в БД,
     * начиная с позиции firstBook, в колличистве booksNum.
     */
    List getBooksDesc(int firstBook, int booksNum);

    /**
     * Выдает перечень курсов в порядке, обратном размещению в БД,
     * начиная с позиции firstCourse, в колличистве courseNum.
     */
    List getCoursesDesc(int firstCourse, int courseNum);

    /**
     * Выдает перечень сайтов в порядке, обратном размещению в БД,
     * начиная с позиции firstSite, в колличистве sitesNum.
     */
    List getSitesDesc(int firstSite, int sitesNum);

}
