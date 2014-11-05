<?php

class MinMax
{
	public function printMin( $numArr, $arrlength )
	{
		$val = min($numArr);

		echo "the Minimum num in the array is  " .$val. "\n" ;
		return $val;
	}

	public function printMax( $numArr, $arrlength )
	{
		$val = max($numArr);

		echo "the Maximum num in the array is  " .$val. "\n" ;
		return $val;
	}

	
	public function inputValues()
	{
			
		$numArr = array();
	
		echo "Enter no.s (press 0 to exit) : " ;

		$i = 0 ;
		$limit = 1 ;
		while ( $limit != 0 )
		{
			$temp2 = fopen ("php://stdin","r");
			$limit = fgets($temp2);
			
			if($limit != 0 )
			{
				$numArr[$i] = $limit ;
			}
			$i++ ;
		}

		$arrlength=count($numArr);
		
		echo "the length of array is " .$arrlength. "\n" ;

		for ( $i = 0 ; $i < $arrlength ; $i++)
		{
			echo $numArr[$i] ;
		} 		

		echo "press 1 to find MIN and 2 to find MAX : " ;
		
		$temp1 = fopen ("php://stdin","r");
		$var1  = fgets($temp1);
		
		while ( $var1 != 1 && $var1 != 2 )
		{
			echo "please press 1 to find MIN and 2 to find MAX : " ;
		
			$temp1 = fopen ("php://stdin","r");
			$var1  = fgets($temp1);
		}
		
		if( $var1 == 1 )
		{
			$this->printMin( $numArr, $arrlength );
		}

		else if( $var1 == 2 )
		{
			$this->printMax( $numArr, $arrlength );
		}		
	}
	
}


//echo $line;

$t1 = new MinMax();
$t1->inputValues();