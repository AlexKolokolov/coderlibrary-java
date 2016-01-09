package ua.com.coderlibrary.servlets;

import ua.com.coderlibrary.controller.Controller;
import ua.com.coderlibrary.view.HeaderPanel;
import ua.com.coderlibrary.view.NavPanel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Сервлет страницы с перечнем книг.
 * Формирует верхнюю панель для страницы.
 * Формирует навигационную панель для пагинации.
 * Извлекает из БД порцию книг в количестве pageSize.
 * Передает все в books.jsp.
 */
public class Books extends HttpServlet {
    private String title = "Книги";
    private int pageId = 1;
    private int pageSize = 5;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HeaderPanel headerPanel = new HeaderPanel(title, pageId);

        req.setAttribute("headerPanel", headerPanel);

        int page = 1;
        if (req.getParameter("page") != null) {
            page = Integer.parseInt(req.getParameter("page"));
        }

        int pageNum = (int)Math.ceil((double)Controller.getInstance().getBooksNum() / pageSize);

        req.setAttribute("navPanel", new NavPanel(pageNum, page, headerPanel.getMenuButtons().get(pageId).getUrl()));

        req.setAttribute("books", Controller.getInstance().getBooks(page, pageSize));
        req.getRequestDispatcher("books.jsp").forward(req, resp);
    }
}
