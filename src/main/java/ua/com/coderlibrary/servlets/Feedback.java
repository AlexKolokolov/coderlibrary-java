package ua.com.coderlibrary.servlets;

import ua.com.coderlibrary.controller.Mailer;
import ua.com.coderlibrary.view.HeaderPanel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 02.01.2016.
 */
public class Feedback extends HttpServlet {
    private String title = "Обратная связь";
    private int pageId = 5;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("headerPanel", new HeaderPanel(title, pageId));

        req.getRequestDispatcher("feedback.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String userName = req.getParameter("userName");
        String userEmail = req.getParameter("userEmail");
        String subject = req.getParameter("subject");
        String messageBydy = req.getParameter("messageBody");

        Mailer.getInstance().sendMessage("kolokolov_a@ukr.net", userEmail, subject, messageBydy);

        String message = "Спасибо, " + userName + "!<br> Ваше сообщение:<br>\"" + messageBydy + "\"<br>отправлено.";
        req.setAttribute("message", message);

        doGet(req, resp);
    }

}
