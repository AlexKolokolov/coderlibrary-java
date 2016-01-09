package ua.com.coderlibrary.servlets;

import ua.com.coderlibrary.view.HeaderPanel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет страницы с информацией о проекте.
 * Формирует верхнюю панель для страницы и передает ее все в about.jsp.
 */
public class About extends HttpServlet {
    private String title = "О проекте";
    private int pageId = 4;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("headerPanel", new HeaderPanel(title, pageId));
        req.getRequestDispatcher("about.jsp").forward(req, resp);
    }
}
