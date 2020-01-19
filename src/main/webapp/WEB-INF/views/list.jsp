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
            <th class="col-md-1">번호</th>
            <th class="col-md-7">제목</th>
            <th class="col-md-2">작성자</th>
            <th class="col-md-2">수정 / 삭제</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="board" items="${boardList}">
            <tr id="tr${board.id}">
                <td>${board.id}</td>
                <td><a href="/board/${board.id}">${board.subject}</a></td>
                <td>${board.writer}</td>
                <td>
                    <div class="btn-group">
                        <button name="modify" value="${board.id}"
                                class="btn btn-xs btn-warning">수정</button>
                        <button name="delete" value="${board.id}"
                                class="btn btn-xs btn-danger">삭제</button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
</body>

</html>