<?php
	mysql_connect("localhost","1068104","shubham") or die("Connection not successfull");
	mysql_select_db("1068104") or die("Database not found");
	if($_SERVER['REQUEST_METHOD']=='POST'){
		$user = $_POST['Username'];
		$pass = $_POST['Password'];
		$qry = "Insert into RegisterTest values('$user','$pass')";
		mysql_query($qry) or die('Query Problem');
	}
?>