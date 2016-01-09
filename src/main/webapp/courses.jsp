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
            <c:forEach items="${courses}" var="course">
                <a name="course${course.id}"></a>
                <article>
                    <header>
                        <h2>${course.title}</h2>
                    </header>
                    <img src="/img/courses/course_${course.id}.jpg" />
                    <p><b>Автор: </b>${course.author}</p>
                    <p>${course.info}</p>
                    <a href="${course.url}" target="_blank"><div class="button">Смотреть</div></a>
                </article>
            </c:forEach>
            <%@ include file="modules/navpanel.jsp"%>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
