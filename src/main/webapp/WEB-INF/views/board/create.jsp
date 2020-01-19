<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
</head>
<body>
<div class="container">
    <h2>Write Board Form</h2>
    <form action="/board" method="post">
        <div>
            <label>Writer:</label>
            <input type="text" id="writer" placeholder="Enter Writer" name="writer"/>
        </div>
        <div>
            <label>Subject:</label>
            <input type="text" id="subject" placeholder="Enter Subject" name="subject"/>
        </div>
        <div>
            <label>Contents:</label><br/>
            <textarea rows="20" cols="100" id="contents" placeholder="Enter contents" name="contents"></textarea>
        </div>
        <div>
            <label>Password:</label>
            <input type="password" id="password" placeholder="Enter Password" name="password"/>
        </div>
        <button type="submit">Submit</button>
    </form>
    <a href="/board"><button type="button">Move to List</button></a>
</div>
</body>
</html>