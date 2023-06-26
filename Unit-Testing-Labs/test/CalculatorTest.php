<?php

use PHPUnit\Framework\TestCase;



require('./src/Factorial.php');
class CalculatorTest extends TestCase
{

    public function test_factorial()
    {
        $clac = new Factorial;
        // $result = $clac->factorial(5);

        $this->assertEquals(120, $clac->fact(5));
        $this->assertEquals(1, $clac->fact(1));
        $this->assertEquals(2, $clac->fact(2));
        $this->assertEquals(6, $clac->fact(3));
        $this->assertEquals(24, $clac->fact(4));


        $this->assertEquals(1, $clac->fact(0));

        $this->assertNull($clac->fact('abc'));
        $this->assertNull($clac->fact(-3));
        $this->assertNull($clac->fact(1.5));
        $this->assertNull($clac->fact(NULL));
    }
}
