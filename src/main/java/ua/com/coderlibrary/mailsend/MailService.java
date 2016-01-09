package ua.com.coderlibrary.mailsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by Administrator on 08.01.2016.
 */
@Service("mailService")
public class MailService {

    @Autowired
    private MailSender mailSender;

    public void sendMail(String to, String from, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setReplyTo(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
}
