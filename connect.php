	
<?php  
	/**
	 * 
	 */
	class DB
	{
		public $link;
		private $localhost = 'localhost';
		private $user = 'root';
		private $pass= '';
		private $db_name = 'appmp3_android';

		function __construct()
		{
			$this->link = mysqli_connect($this->localhost, $this->user, $this->pass, $this->db_name);
			mysqli_set_charset($this->link, 'utf8');
		}

		function db_query($query)
		{
			$result = mysqli_query($this->link, $query);
			return $result;
		}

		function db_fetch($_arr)
		{
			$row = mysqli_fetch_assoc($_arr);
			return $row;
		} 
	}
?>