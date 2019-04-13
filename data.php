<?php 
	include('connect.php');
	$tempp = new DB();
	$query = "SELECT * from audio";
	$result = $tempp->db_query($query);
			$it = array();
			$i = 0;
			while ($row = $tempp->db_fetch($result)) {
				$it[$i++] = $row;
			}
	$audio_json = (json_encode($it));
	echo $audio_json;
	mysqli_close($tempp->link);
 ?>