<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="includes/header.jsp" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="panel panel-primary">
    <div class="panel-heading"><h3 class="panel-title">Registration</h3></div>
    <div class="panel-body">

        <form:form modelAttribute="user">
            <form:errors cssClass="error"/>
            <div class="form-group">
                <form:label path="fio">FIO</form:label>
                <form:input path="fio" type="text" class="form-control" id="exampleInputName" placeholder="FIO"/>
                    <%--<form:errors path="name" cssClass="error"/>--%>
            </div>
            <div class="form-group">
                <form:label path="email">Email address</form:label>
                <form:input path="email" type="email" class="form-control" id="exampleInputEmail" placeholder="Email"/>
                    <%--<form:errors path="email" cssClass="error"/>--%>
            </div>
            <div class="form-group">
                <form:label path="login">Login</form:label>
                <form:input path="login" type="login" class="form-control" id="exampleInputLogin"
                            placeholder="login"/>
                <form:errors path="login" cssClass="error"/>
            </div>
            <div class="form-group">
                <form:label path="dayOfBirth">Birthday</form:label>
                <form:input path="dayOfBirth" type="text" class="form-control" id="exampleInputBirthday"
                            placeholder="Birthday"/>
                    <%--<form:errors path="birthday" cssClass="error"/>--%>
            </div>
            <%--<div class="form-group">--%>
            <%--<label for="exampleInputFile">File input</label>--%>
            <%--<input type="file" id="exampleInputFile">--%>
            <%--<p class="help-block">Example block-level help text here.</p>--%>
            <%--</div>--%>
            <%--<div class="checkbox">--%>
            <%--<label>--%>
            <%--<input type="checkbox"> Check me out--%>
            <%--</label>--%>
            <%--</div>--%>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</div>

<%@include file="includes/foooter.jsp" %>