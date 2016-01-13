package ua.com.coderlibrary.view;

/**
 * Created by Administrator on 13.01.2016.
 */
public class EmailMessage {
    private String userName;
    private String userEmail;
    private String subject;
    private String messageBody;

    public EmailMessage(String userName, String userEmail, String subject, String messageBody) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.subject = subject;
        this.messageBody = messageBody;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public String getMessageForSending() {
        return userName + " <" + userEmail + "> : " + messageBody;
    }

}
