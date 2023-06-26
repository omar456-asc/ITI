<?php

class Factorial
{

    public function fact($num)
    {


        if ($num > 0 && is_int($num)) {
            $factorial = 1;
            for ($i = 1; $i <= $num; $i++) {
                $factorial *= $i;
            }
        }
         else 
        {
            $factorial=null;
        }

        return $factorial;
    }
}


// $f=new Factorial();
// echo $f->fact(5.5);

