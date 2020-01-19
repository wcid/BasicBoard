<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
</head>
<body>
<div>
    <h3>Subject : ${board.subject}</h3>
    <h4>Writer : ${board.writer}</h4>
    <h3>Contents : </h3>
    <h4>${board.contents}</h4>
    <h4>Creation DateTime : ${board.creationDateTime}</h4>
    <h4>Modification DateTime : ${board.modificationDateTime}</h4>
</div>
</body>
</html>