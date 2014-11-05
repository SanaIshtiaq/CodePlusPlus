<?php

class Factorial
{
	public function printFactorial($limit)
	{
		$ans = 1;
		
		//$n = 1;

		echo "\n" ;
		for($i = 1 ; $i<=$limit ; $i++)
		{
			$ans = $ans * $i ;
		}

		echo "Factorial of " .$limit. " is " .$ans. "\n" ;

		return $ans;
	}
	public function inputValues()
	{
		$limit = -1;
		while ( $limit < 1 )
		{
			echo "enter limit : " ;
			$temp2 = fopen ("php://stdin","r");
			$limit = fgets($temp2);
		}
		$this->printFactorial($limit);
	}
	
}

$t1 = new Factorial();
$t1->inputValues();

?>