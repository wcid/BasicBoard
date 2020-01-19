<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<div class="container">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Number</th>
            <th>Subject</th>
            <th>Writer</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="${boardList}">
            <tr id="tr${board.id}">
                <td>${board.id}</td>
                <td><a href="/board/${board.id}">${board.subject}</a></td>
                <td>${board.writer}</td>
                <td>
                    <div>
                        <button name="modify" value="${board.id}">Modify</button>
                        <button name="delete" value="${board.id}">Delete</button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<button id="createBtn" type="button" class="btn btn-info btn-sm" data-toggle="modal">Write</button>
</body>
</html>