<?php
require_once('Factorial.php');

class factorialTest extends PHPUnit_Framework_TestCase
{
	
	public function setUp () 
	{
	}

	public function tearDown()
	{
	}

	
	public function test_printFactorial()
	{
		$f2 = new Factorial();
		
		//$this->assertGreaterThan(160, $f2->printFactorial(5));
		$this->assertEquals(120,$f2->printFactorial(5));
		$this->assertEquals(24,$f2->printFactorial(4));
		//$this->assertEquals(0,$f2->printFactorial(-1));
	}
}

?>