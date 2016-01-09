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
            <%@ include file="modules/navpanel.jsp"%>
            <c:forEach items="${books}" var="book">
                <a name="book${book.id}"></a>
                <article>
                    <header>
                        <h2>${book.title}</h2>
                    </header>
                    <img src="/img/books/book_${book.id}.jpg" />
                    <p><b>Автор: </b>${book.author}</p>
                    <p>${book.info}</p>
                    <a href="${book.url}" target="_blank"><div class="button">Скачать</div></a>
                </article>
            </c:forEach>
            <%@ include file="modules/navpanel.jsp"%>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
