package ua.com.coderlibrary.servlets;

import ua.com.coderlibrary.controller.Controller;
import ua.com.coderlibrary.view.HeaderPanel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет главной страницы сайта.
 * Формирует верхнюю панель для страницы.
 * Извлекает титулы последних элементов из таблиц БД книг, видеокурсов и сайтов в количестве elementsNum.
 * Передает все в index.jsp.
 */
public class Main extends HttpServlet {
    private String title = "Библиотека кодера";
    private int pageId = 0;
    private int elementsNum = 5;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("headerPanel", new HeaderPanel(title, pageId));

        Controller controller = Controller.getInstance();
        req.setAttribute("books", controller.getBooks(elementsNum));
        req.setAttribute("courses", controller.getCourses(elementsNum));
        req.setAttribute("sites", controller.getSites(elementsNum));
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
