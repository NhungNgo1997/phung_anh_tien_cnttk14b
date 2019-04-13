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
	$show_song = '';
	$i = 1;
	foreach ($it as $key => $value) {
		$show_song .= '<a href = "audio.php?song='.$value['id'].'"><small>'.$i++.'&ensp;&ensp;</small>'.$value['title'].'<span>&ensp;-- </span><small><i>'.$value['singger'].'</i></small><a/><br><br>';
	}
 ?>
<!DOCTYPE html>
<html>
<head>
	<title>Index</title>
	<style>
		a{
			color: #C92624;
			text-decoration: none;
		}
		a:hover{
			text-decoration: none;
		}
	</style>
</head>
<body style="padding: 100px; background-color: #C7CBD1;">
	<h1>List Song</h1>
	<?php echo $show_song; ?>
</body>
</html>