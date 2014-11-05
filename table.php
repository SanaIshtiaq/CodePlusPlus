<?php

class table
{
	public function printTable($limit, $num)
	{
		echo "\n" ;
		for($i = 1 ; $i<=$limit ; $i++)
		{
			echo $num. "    *    " .$i. " = " .$num*$i. "\n" ;
		}
	}
	public function inputValues()
	{
		$num = 601;
		$limit = -1;
		while ($num > 600 || $limit < 1)
		{
			echo "enter a number : " ;
			$temp = fopen ("php://stdin","r");
			$num = fgets($temp);
			
			echo "enter limit : " ;
			$temp2 = fopen ("php://stdin","r");
			$limit = fgets($temp2);
		}
		$this->printTable($limit,$num);
	}
	
}


//echo $line;

$t1 = new table();
$t1->inputValues();
//$t1->printTable($limit,$num);

?>