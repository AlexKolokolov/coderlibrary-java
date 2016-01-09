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
            <c:forEach items="${sites}" var="site">
                <a name="site${site.id}"></a>
                <article>
                    <header>
                        <h2>${site.title}</h2>
                    </header>
                    <img src="/img/sites/site_${site.id}.jpg" />
                    <p>${site.info}</p>
                    <a href="${site.url}" target="_blank"><div class="button">Перейти</div></a>
                </article>
            </c:forEach>
            <%@ include file="modules/navpanel.jsp"%>
        </main>
        <%@ include file="modules/footer.jsp"%>
    </body>
</html>
