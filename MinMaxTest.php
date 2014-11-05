<?php
require_once('MinMax.php');

class MinMaxTest extends PHPUnit_Framework_TestCase
{	
	public function setUp () 
	{}

	public function tearDown()
	{}
	
	public function test_printMin()
	{
		$m1 = new MinMax();
		$numArr = array(2,5,1,0,9);

		//$this->assertGreaterThan(160, $m1->printMin(5));
		$this->assertEquals(0,$m1->printMin($numArr,5));
		//$this->assertEquals(24,$m1->printMin(4));
		//$this->assertEquals(0,$m1->printMin(-1));
	}
	
	public function test_printMax()
	{
		$m2 = new MinMax();
		$numArr = array(2,5,1,0,9);
		
		//$this->assertGreaterThan(160, $m2->printMax(5));
		$this->assertEquals(9,$m2->printMax($numArr,5));
		//$this->assertEquals(24,$m2->printMax(4));
	}
}
?>