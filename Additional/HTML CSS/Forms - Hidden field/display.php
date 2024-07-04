<?php
	$name = $_GET["name"];
	$email = $_GET["email"];
	$phoneNumber = $_GET["phoneNumber"];
	$userName = $_GET["userName"];
	$password = $_GET["password"];
	$hidden = $_GET["hidden"];
	echo "<center><h2>You have successfully registered</h2>";
	echo "<table><tr><td style='text-align:right'>Name :</td><td>$name </td></tr>";
	echo "<tr><td style='text-align:right'>Email :</td><td>$email</td></tr>";
	echo "<tr><td style='text-align:right'>Phone Number :</td><td>$phoneNumber</td></tr>";
	echo "<tr><td style='text-align:right'>Username :</td><td>$userName</td></tr>";
	echo "<tr><td style='text-align:right'>Event :</td><td>$hidden</td></tr></table>";
?>