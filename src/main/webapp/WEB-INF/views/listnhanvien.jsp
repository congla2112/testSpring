<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<c:url value="/deletenhanvien/" var="urlDeletenv" />
	<table class="table table-hover table-dark" border="1 soid">
		<a href="savenhanvien">Thêm Nhân Viên</a>
		<tr>
			<th>MaNV</th>
			<th>TenNV</th>
			<th>DiaChi</th>
			<th>Email</th>
			<th>GioiTinh</th>
			<th>SoDT</th>
			<th>UserName</th>
			<th>MaQuyen</th>
			<th>pass</th>
		</tr>

		<c:forEach var="listnhanvien" items="${listnhanvien}">
			<tr>
				<td>${listnhanvien.maNV}</td>
				<td>${listnhanvien.tennv}</td>
				<td>${listnhanvien.diaChi}</td>
				<td>${listnhanvien.email}</td>
				<td><c:choose>
						<c:when test="${listnhanvien.gioitinh==true}">Nam</c:when>
						<c:when test="${listnhanvien.gioitinh==false}">Nữ</c:when>
					</c:choose></td>

				<td>${listnhanvien.sodienthoai}</td>
				<td>${listnhanvien.userName}</td>
				<td>${listnhanvien.nhomquyen.tenNhomQuyen}</td>
				<td>${listnhanvien.passWord}</td>
				<td><a href="updatenhanvien/${listnhanvien.maNV}">Sửa</a></td>
				<td><a href="deletenhanvien/${listnhanvien.maNV}" onclick="return confirm('xx')">Xóa</a></td>


			</tr>

		</c:forEach>
	</table>
</body>
</html>