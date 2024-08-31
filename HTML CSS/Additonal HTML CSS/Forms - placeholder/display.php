<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<center>
<h2>User Details</h2>
<?php
$name = $_POST['name'];
$username = $_POST['userName'];
$mobileNumber = $_POST['mobilenumber'];
$address = $_POST['address'];
echo "<br>Name : ".$name;
echo "<br>User name : ".$username;
echo "<br>MobileNumber : ".$mobileNumber;
echo "<br>Address : ".$address;
?>
</center>
</body>
</html>
