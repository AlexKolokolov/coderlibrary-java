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
 * Сервлет страницы с перечнем сайтов.
 * Формирует верхнюю панель для страницы.
 * Формирует навигационную панель для пагинации.
 * Извлекает из БД порцию сайтов в количестве pageSize.
 * Передает все в sites.jsp.
 */
public class Sites extends HttpServlet {
    private String title = "Сайты";
    private int pageId = 3;
    private int pageSize = 5;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HeaderPanel headerPanel = new HeaderPanel(title, pageId);

        req.setAttribute("headerPanel", headerPanel);

        int page = 1;
        if (req.getParameter("page") != null) {
            page = Integer.parseInt(req.getParameter("page"));
        }
        int pageNum = (int)Math.ceil((double)Controller.getInstance().getSitesNum() / pageSize);

        req.setAttribute("navPanel", new NavPanel(pageNum, page, headerPanel.getMenuButtons().get(pageId).getUrl()));

        req.setAttribute("sites", Controller.getInstance().getSites(page, pageSize));

        req.getRequestDispatcher("sites.jsp").forward(req, resp);
    }
}
