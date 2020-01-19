<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>BasicBoard</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
</head>
<body>
<div>
    <div>
        <label>Writer:</label>
        ${board.writer}
    </div>
    <div>
        <label>Subject:</label>
        ${board.subject}
    </div>
    <div>
        <label>Contents:</label><br/>
        <textarea rows="20" cols="100" readonly="true">${board.contents}</textarea>
    </div>
    <div>
        <label>Creation DateTime:</label>
        ${board.creationDateTime}
    </div>
    <div>
        <label>Modification DateTime:</label>
        ${board.modificationDateTime}
    </div>
</div>
<a href="/board"><button type="button">Move to List</button></a>
<a href="/board/update/${board.id}"><button type="button">Update</button></a>
<button type="button" id="deleteBoard">Delete</button>
<script type="text/javascript">
    $("#deleteBoard").click(function() {
        var result = confirm("Delete?");
        if(result) {
            location.href = '/board/delete/${board.id}';
        }
    });
</script>

</body>
</html>