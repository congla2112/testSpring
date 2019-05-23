<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>

	<table class="table table-hover table-dark">
		<tr>
			<th>MãQuyền</th>
			<th>TênQuyền</th>
		</tr>


		<c:forEach var="cc" items="${listquyen}">
			<tr>
				<td>${cc.maNhomQuyen}</td>
				<td>${cc.tenNhomQuyen}</td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>