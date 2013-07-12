
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%
    String file1  = (String)request.getAttribute("file1_info");
    String file2  = (String)request.getAttribute("file_name");
    out.println(file1);
    out.println(file2);
%>    
