<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>

<body>
	<table>
			<tr>
				<td>id</td>
				<td>userName</td>
				<td>age</td>
				<td>userPho</td>
				<td>ctfNbr</td>
				<td>isAuth</td>
				<td>lastModifyTime</td>
			</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.userName}</td>
				<td>${user.age}</td>
				<td>${user.userPho}</td>
				<td>${user.ctfNbr}</td>
				<td>${user.isAuth}</td>
				<td>${user.lastModifyTime}</td>
			</tr>
		</c:forEach>
	
	</table>

</body>
</html>