<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@ include file="modules/head.jsp"%>
</head>
    <body>
        <%@ include file="modules/headerpanel.jsp"%>
        <main>
            <article>
                <header>
                    <h2>Напишите мне письмо</h2>
                </header>
                <form name="mail" action="/feedback" method="post">
                    <label for="name">Имя:</label><input type="text" placeholder="Ваше имя" name="userName" id="name" /><br><br>
                    <label for="email">E-mail:</label><input type="text" placeholder="Ваш e-mail" name="userEmail" id="email" /><br><br>
                    <label for="subject">Тема:</label><input type="text" placeholder="Тема сообщения" name="subject" id="subject" /><br><br>
                    <textarea type="text" placeholder="Текст сообщения" name="messageBody" id="message"></textarea><br><br>
                    <input class="button" type="submit" value="Отправить" />
                </form>
                <c:if test="${not empty message}">
                    <h3>${message}</h3>
                    <input class="button" type="button" onclick="window.location.href='/feedback'" value="OK">
                </c:if>
            </article>
            <%@ include file="modules/social.jsp"%>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
