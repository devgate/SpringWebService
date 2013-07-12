<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
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
<form:form commandName="board" action="/board/add" method="POST">
    <form:errors path="*" />

    <form:input path="title" />
    <form:errors path="title" />

    <form:input path="writer" />
    <form:errors path="writer" />

    <form:input path="content" />
    <form:errors path="content" />

    <input type="hidden" id="pw" name="pw" value="pw">
    <input type="submit" value="save">


</form:form>
<script type="text/javascript">

    function del(id){
        window.location="/board/del?id="+id;
    }

</script>
</body>
</html>