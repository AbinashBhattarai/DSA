<?php
//Write a function reverseString($str) that reverses a string manually, 
//using a loop — don't use PHP's built-in strrev().
function revString($string){
    $i = 0;
    $j = strlen($string)-1;
    while($i<$j){
        $temp = $string[$i];
        $string[$i] = $string[$j];
        $string[$j] = $temp;
        $i++;
        $j--;
    }
    return $string;
}

echo "<br>" . revString("abinash");