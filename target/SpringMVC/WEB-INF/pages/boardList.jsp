<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="com.drjun.board.model.Board" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<spring:hasBindErrors name="board" />
<form:errors path="board"/>
<form name="boardForm" id="boardForm" method="POST" action="/board/add">


<h1>Board List</h1>
<table>
<c:forEach var="board" items="${boardList}">
<tr >
    <%--<td>${board.id}</td>--%>
    <td>${board.title}</td>
    <td>${board.writer}</td>
    <td>${board.content}</td>
    <td><input type="button" onclick="JavaScript:del(${board.id})" value="delete"> </td>
</tr>

</c:forEach>
</table>

<input type="text" id="title" name="title">
<input type="text" id="writer" name="writer">
<input type="text" id="content" name="content">
<input type="hidden" id="pw" name="pw" value="pw">
<input type="submit" value="save">


</form>
<script type="text/javascript">

    function del(id){
        window.location="/board/del?id="+id;
    }

</script>
</body>
</html>