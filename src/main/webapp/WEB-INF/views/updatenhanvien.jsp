<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<a href='<c:url value="/updatenv"  var ="updatenv"></c:url>'></a>
		<form:form action="${updatenv}" method="POST" modelAttribute="nhanvien">
		<div class="form-group">
			<label for="formGroupExampleInput">Mã nhân viên</label>
			<form:input type="hidden" class="form-control" path="maNV"
				placeholder="Mã nhân viên" />
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Họ tên</label>
			<form:input type="text" class="form-control" path="tennv"
				placeholder="Tên nhân viên" />
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Email</label>
			<form:input type="email" class="form-control" path="email"
				placeholder="Nhập email"></form:input>
			<small class="form-text text-muted">We'll never share your
				email with anyone else.</small>
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Địa chỉ</label>
			<form:input type="text" class="form-control" path="diaChi"
				placeholder="Địa chỉ" />
		</div>
		<div class="form-group">
			<form:label path="gioitinh">Giới tính</form:label>
		</div>
		<div class="custom-control custom-radio custom-control-inline">
			<form:radiobutton path="gioitinh" value="1" label="Nam" />
			<form:radiobutton path="gioitinh" value="0" label="Nữ" />
		</div>


		<div class="form-group">
			<label for="formGroupExampleInput2">Phone</label>
			<form:input type="text" class="form-control" path="sodienthoai"
				placeholder="Số điện thoại" />
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Username</label>
			<form:input type="text" class="form-control" path="userName"
				placeholder="username" />
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Pass</label>
			<form:input type="text" class="form-control" path="passWord"
				placeholder="password" />
		</div>
		<div class="form-group">
			<label for="formGroupExampleInput2">Quyền</label>
			<form:select path="nhomquyen.maNhomQuyen" class="custom-select">
				<form:option value="Admin" />
				<form:option value="Staff" />
			</form:select>

		</div>
		<button type="submit" class="btn btn-primary">Sửa</button>
	</form:form>
</body>
</html>