<?php
require_once('index.php');

class calcTest extends PHPUnit_Framework_TestCase
{
	/*
	public function setUp () 
	{
	}

	public function tearDown()
	{
	}*/

	public function testAddition()
	{
		$c2 = new calc();
		$this->assertEquals(5,$c2->addFunc(-1,100));
	}

	public function testSubtraction()
	{
		$c2 = new calc();
		$this->assertEquals(4,$c2->subtractFunc(5,1));
	}
	
	public function testMultiplication()
	{
		$c2 = new calc();
		$this->assertEquals(4,$c2->multiplyFunc(2,2));
	}

	public function testDivision()
	{
		$c2 = new calc();
		
		//$this->assertGreaterThan(5, $c2->divisionFunc(4,2));
		//$this->assertEquals(3,$c2->divisionFunc(8,2));
		$this->assertEquals(4,$c2->divisionFunc(8,2));
	}
}

?>