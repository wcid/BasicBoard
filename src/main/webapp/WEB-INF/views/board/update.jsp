<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
</head>
<body>
<div class="container">
    <h2>Update Board form</h2>
    <form action="/board/update/${board.id}" method="post">
        <input type="hidden" value="${board.id}" name="id">
        <div>
            <label>Writer:</label>
            <input type="text" id="writer" name="writer" readonly="readonly" value="${board.writer}">
        </div>
        <div>
            <label>Subject:</label>
            <input type="text" id="subject" name="subject" value="${board.subject}">
        </div>
        <div>
            <label>Contents:</label><br/>
            <textarea rows="20" cols="100" id="contents" name="contents">${board.contents}</textarea>
        </div>
        <button type="submit">Submit</button>
    </form>
    <a href="/board/${board.id}"><button type="button">Cancel</button></a>
    <a href="/board"><button type="button">Move to List</button></a>
</div>
</body>
</html>