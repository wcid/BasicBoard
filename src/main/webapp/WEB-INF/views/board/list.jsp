<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Number</th>
            <th>Subject</th>
            <th>Writer</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="${boardList}">
            <tr id="tr${board.id}">
                <td>${board.id}</td>
                <td><a href="/board/${board.id}">${board.subject}</a></td>
                <td>${board.writer}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="/board/create"><button type="button">Write</button></a>
</body>
</html>