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
                    <h2>Учебный проект начинающего программиста Алексея Колоколова</h2>
                </header>
                <p>
                    Сайт представляет собой сборник книг, ссылок на видеокурсы и сайты,
                    которые могут быть полезны для тех, кто решил попробовать освоить информационные технологии:
                    <b>Java, PHP, JavaScript, HTML, SQL</b> и др.<br>
                    При создании сайта применялись технологии <b>JavaEE: Servlet, JSP, JSTL,</b>
                    фреймворки <b>Spring</b> и <b>Hibernate</b>. В качестве СУБД использовалась <b>MySQL</b>.<br>
                    Сборка проекта производилась при помощи <b>Maven</b>.
                    С исходным кодом проекта можно ознакомиться в моем репозитории
                    на <a href="https://github.com/AlexKolokolov/coderlibrary" target="_blank"><b>GitHub</b></a>.<br>
                    Планируется регулярное добавление и обновление контента.<br>
                    В разделе <a href="/feedback"><b>Обратная связь</b></a> есть возможность связаться со мной,
                    если у Вас появятся вопросы и предложения.
                </p>
            </article>
            <%@ include file="modules/social.jsp"%>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
