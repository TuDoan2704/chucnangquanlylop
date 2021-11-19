<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form action="BuoiHocController" method = "POST">
	<table>
		 <tr>
            <th>ID</th>
            <th>Ten Buoi Hoc</th>
            
        </tr>
        <c:forEach items = "${list}" var = "l">
        <tr>
        
            <td>${l.id}</td>
            <td>${l.tenbuoihoc}</td>
            
        </tr>
        </c:forEach>
	</table>
	<input type = "text" name = "id">
	<input type = "submit" value = "check">
	</form>
</body>
</html>