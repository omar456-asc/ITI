<?php

class Calculator {

    public function fact($n){
        if(is_int($n)&& $n >=0){
        if($n <2){
            return 1;
        }
        return ($n* $this->fact($n-1));
        }
}
}
?>