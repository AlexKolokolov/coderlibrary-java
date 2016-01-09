<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <h1>${headerPanel.title}</h1>
    <nav>
        <table>
            <tr>
                <c:forEach  var="menuButton" items="${headerPanel.menuButtons}">
                    ${menuButton.active ? "<td id=\"active\">" : "<td>"}
                        <a href="${menuButton.url}" title="${menuButton.name}">${menuButton.name}</a>
                    </td>
                </c:forEach>
            </tr>
        </table>
    </nav>
</header>

