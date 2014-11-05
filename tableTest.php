<?php

require_once('table.php');

class tableTest extends PHPUnit_Framework_Testcase
{
	public function testInputValues()
	{
		$t = new table();
		$this->assertEquals(5,$t->inputValues(-1,100));
	}
}

?>