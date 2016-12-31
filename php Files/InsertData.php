<?php
	mysql_connect("localhost","1068104","shubham") or die("Connection not successfull");
	mysql_select_db("1068104") or die("Database not found");
	if(isset($_POST['Username']) && isset($_POST['Password'])){
		$user = $_POST['Username'];
		$pass = $_POST['Password'];
		$qry = "Insert into RegisterTest where values('$user','$pass')";
		mysql_query($qry) or die('Query Problem');
	}
?>