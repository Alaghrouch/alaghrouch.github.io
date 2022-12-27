<?php
    $name = $_POST['name'];
	$email = $_POST['email'];
	$project = $_POST['project'];
	$message = $_POST['message'];


	// Database connection
	$conn = new mysqli('localhost:3307','root','','portfolio');
	if($conn->connect_error){
		echo "$conn->connect_error";
		die("Connection not yet done : ". $conn->connect_error);
	} else {
		$stmt = $conn->prepare("insert into table1(name, email, project, message ) values(?, ?, ?, ?)");
		$stmt->bind_param("ssss",$name, $email, $project, $message);
		$execval = $stmt->execute();
		echo $execval;
		echo "inscription réussi...";
		$stmt->close();
		$conn->close();
	}
?>