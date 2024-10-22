<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mobile Details</title>
<style>
body {
	background-color: #ffb50042;
	color: black;
}
.form-list .form-group input {
	width: 100%;
	font-size: 13px;
	height: 38px;
	box-sizing: border-box;
	padding-left: 15px;
	padding-right: 15px;
}

button {
	display: inline-block;
	background-color: #ffb500;
	color: #fff;
	border: none;
	padding: 10px 25px;
	text-transform: uppercase;
	font-weight: 700;
	cursor: pointer;
	margin-bottom: 10px;
}

.container {
	width: 90%;
	margin: 0 auto;
	text-align: left;
}

h3 {
	color: #C71585;
	font-size: 28px;
}

table#hotel-list {
	border-collapse: collapse;
	width: 100%;
	background-color: #fff;
	box-shadow: 0px 4px 5px 0px #ededed;
}

table{
width: 100%;
}
table th {
    background-color: #ffb500;
    color: white;
    padding: 12px 15px;
}

table td {
	padding: 12px 15px;
}

tr:nth-child(even) {
  background-color: #ffb50042;
}

table tr {
	background-color: #ffb5001f;
}
</style>
</head>
<body>
	<div class="container">
	<form action="add" method="post">
		<div class="form-list">
			<h3>Mobile Detail List</h3>
			<button type="submit" id="add-mobile">Add
					Mobile</button>
		</div>
		<table id="mobile">
			<tr>
				<th>Mobile Brand</th>
				<th>Mobile Model</th>
				<th>Price</th>
				<th>Release Year</th>
			</tr>
			<!-- Fill your code here-->
		</table>
			</form>
	</div>
</body>
</html>
