<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List</title>
<style type="text/css">
     #grad1 {
        	height:50%
            background: lightsteelblue;
            background: linear-gradient(lightsteelblue, lightskyblue);
        }

        body {

            background-repeat: no-repeat;
            background-attachment: fixed;
            background-position: center;

        }

        .header {
            background-color: lightsteelblue;
            
            width: 100%;
            
        }

        .footer {
            position: absolute;
            right: 0;
            bottom: 0;
            left: 0;
            height: 5%;
            text-align: center;
        }
        #content{
            position:absolute;
            top:220;
            left:200;
            text-align:left;
        }

        p {
            margin-left: 20px;
            font-family: 'Courier New', Courier, 'Lucida Sans Typewriter', 'Lucida Typewriter', monospace;
            font-size: 16px;
            font-style: normal;
            font-variant: normal;
            font-weight: bold;
            line-height: 26.4px;
        }

        .boxed {
            width: 500;
            padding: 10px;
            border: 2px solid black;
            margin: 10px;
            align: center;
            backgorund-color: lightblue;

        }
        .box{
        text-align:left;
        padding: 10px;
            border: 2px solid black;
            margin: 10px;
        }

        .p1 {
            color: white;
        }
    </style>
</head>

<body>
<center>
    <div class="container">		
			<h2>Product List</h2>
			<table border=1 id="product-list">
				<tr>
					<th>Name</th>
					<th>Brand</th>
					<th>Category</th>
					<th>Price</th>
				</tr>
				<c:forEach var="product" items="${productList}">
					<tr>
						<td>${product.name}</td>
						<td>${product.brand}</td>
						<td>${product.category}</td>
						<td>${product.price}</td>
					</tr>
				</c:forEach>
			</table>		
	</div>
    </center>
</body>

</html>
