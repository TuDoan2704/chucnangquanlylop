<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<table>
		 <tr>
            <th>ID</th>
            <th>Ten Giao Vien</th>
            
        </tr>
        <c:forEach items = "${list}" var = "l">
        <tr>
        
            <td>${l.id}</td>
            <td>${l.tenGiaoVien}</td>
            
        </tr>
        </c:forEach>
	</table>
	

</body>
</html>