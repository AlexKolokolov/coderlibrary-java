<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav>
    <c:if test="${not empty navPanel.previousButton}">
        <a href="${navPanel.previousButton.url}"><div class="button" id="previous">${navPanel.previousButton.name}</div></a>
    </c:if>
    <div class="pageNumber">${navPanel.currentPage}</div>
    <c:if test="${not empty navPanel.nextButton}">
        <a href="${navPanel.nextButton.url}"><div class="button" id="next">${navPanel.nextButton.name}</div></a>
    </c:if>
</nav>