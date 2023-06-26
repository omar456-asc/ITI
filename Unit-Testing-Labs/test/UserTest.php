<?php
use PHPUnit\Framework\TestCase;
require('./src/User.php');

class UserTest extends TestCase
{
    public function testValidEmail()
    {
        $user = new User(1,'omar','omar@gmail.com');

        $this->assertMatchesRegularExpression('/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/', $user->getEmail());
    }

    public function testInvalidEmail()
    {
        $user = new User(1,'omar','invaild');

        $this->assertFalse(filter_var($user->getEmail(), FILTER_VALIDATE_EMAIL));
    }
}
