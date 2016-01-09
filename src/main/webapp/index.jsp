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
                    <h2><a href="/books">Последние добавленные книги</a></h2>
                </header>
                <p>
                    <c:forEach items="${books}" var="book">
                        <a href="/books#book${book.id}"><b>${book.title},</b> ${book.author}</a><br>
                    </c:forEach>
                </p>
            </article>
            <article>
                <header>
                    <h2><a href="/courses">Последние добавленные видеокурсы</a></h2>
                </header>
                <p>
                    <c:forEach items="${courses}" var="course">
                        <a href="/courses#course${course.id}"><b>${course.title},</b> ${course.author}</a><br>
                    </c:forEach>
                </p>
            </article>
            <article>
                <header>
                    <h2><a href="/sites">Последние добавленные сайты</a></h2>
                </header>
                <p>
                    <c:forEach items="${sites}" var="site">
                        <a href="/sites#site${site.id}"><b>${site.title}</b></a><br>
                    </c:forEach>
                </p>
            </article>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
