<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="includes/header.jsp" %>

<table width="50%">
    <tr>
        <th>Name</th>
        <th>Login</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td>${user.fio}</td>
            <td>${user.login}</td>
            <td>${user.email}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<input type="button" value="Back" onclick="javascript:history.back()"/>

<%@include file="includes/foooter.jsp" %>