<?php

class calc
{
	public function addFunc($x, $y)
	{
		//echo "addition of " .$x. " and " .$y. " is " .$x+$y. "\n" ;
		return $x+$y ;
	}
	
	public function subtractFunc($x, $y)
	{
		//echo "subtraction of " .$x. " and " .$y. " is " .$x-$y. "\n" ;
		return $x-$y ;
	}
	
	public function multiplyFunc($x, $y)
	{
		//echo "multiplication of " .$x. " and " .$y. " is " .$x*$y. "\n" ;
		return $x*$y ;
	}

	public function divisionFunc($x, $y)
	{
		//echo "division of " .$x. " and " .$y. " is " .$x/$y. "\n" ;
		return $x/$y ;
	}

	
}

echo "calling from main \n";

$c1 = new calc();

//$c1->addFunc(4,4);
//$c1->subtractFunc(5,1);
//$c1->multiplyFunc(2,8);
//$c1->divisionFunc(6,2);

?>