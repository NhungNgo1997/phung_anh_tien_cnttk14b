<?php
	include('connect.php');
	$tempp = new DB(); 
	if(isset($_GET['song']))
	{
		$query = "SELECT * from audio where id = ".$_GET['song'];
		$result = $tempp->db_query($query);
			$it = array();
			$i = 0;
			while ($row = $tempp->db_fetch($result)) {
				$it[$i++] = $row;
			}
	}
 ?>
<!DOCTYPE html>
<html>
<head>
	<title>Audio</title>
</head>
<body>
	<audio controls loop autoplay>
		<source src="audio/<?php echo $it[0]['title'] ?>.mp3" type="audio/mpeg">
	</audio>
</body>
</html>