<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script>
        function sub(){
            $("form[name=UploadFrm]").submit();
        }
    </script>
</head>
<body>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<form name="UploadFrm" enctype="multipart/form-data" action="/fileUpload" method="post">
    <input type="file" name="file1">
    <input type="text" name="fileName" value="fileName">
    <input type="button" onclick="sub();" value="전송">
</form>
</body>
</html>