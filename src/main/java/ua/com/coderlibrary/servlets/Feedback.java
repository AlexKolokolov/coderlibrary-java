package ua.com.coderlibrary.servlets;

import ua.com.coderlibrary.controller.Mailer;
import ua.com.coderlibrary.view.HeaderPanel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 02.01.2016.
 */
public class Feedback extends HttpServlet {
    private String title = "Обратная связь";
    private int pageId = 5;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        createPageDefaultElements(req);
        req.getRequestDispatcher("feedback.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sendMessage(req);
        createPageDefaultElements(req);
        req.getRequestDispatcher("feedback.jsp").forward(req, resp);
    }

    private void createPageDefaultElements (HttpServletRequest req) {
        req.setAttribute("headerPanel", new HeaderPanel(title, pageId));
    }

    private void sendMessage(HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        String userName = req.getParameter("userName");
        String userEmail = req.getParameter("userEmail");
        String subject = req.getParameter("subject");
        String messageBody = req.getParameter("messageBody");
        Mailer.getInstance().sendMessage("kolokolov_a@ukr.net", userEmail, subject,
                userName + " <" + userEmail + "> : " + messageBody);
        showSentMessage(req, userName, messageBody);
    }

    private void showSentMessage(HttpServletRequest req, String userName, String messageBody) {
        String message = "Спасибо, " + userName + "!<br> Ваше сообщение:<br>\"" + messageBody + "\"<br>отправлено.";
        req.setAttribute("message", message);
    }
}
