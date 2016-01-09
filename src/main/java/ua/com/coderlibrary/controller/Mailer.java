package ua.com.coderlibrary.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.coderlibrary.mailsend.MailService;

/**
 * Created by Administrator on 08.01.2016.
 */
public class Mailer {
    private static Mailer instance;
    private MailService mailService;

    private Mailer() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"springConfig.xml"});
        mailService = (MailService) context.getBean("mailService");
    }

    public static Mailer getInstance() {
        if (instance == null) instance = new Mailer();
        return instance;
    }

    public void sendMessage(String to, String from, String subject, String body) {
        mailService.sendMail(to, from, subject, body);
    }
}
