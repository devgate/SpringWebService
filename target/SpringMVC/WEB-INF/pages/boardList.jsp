<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.drjun.board.model.Board" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<form name="boardForm" id="boardForm" method="POST" action="/board/add">


<h1>Board List</h1>
<table style="border: 1px">
<c:forEach var="board" items="${boardList}">
<tr >
    <td style="border: 1px">${board.id}</td>
    <td>${board.title}</td>
    <td>${board.writer}</td>
    <td>${board.content}</td>
</tr>

</c:forEach>
</table>

<input type="text" id="title" name="title">
<input type="text" id="writer" name="writer">
<input type="text" id="content" name="content">
<input type="submit" value="save">


</form>
</body>
</html>