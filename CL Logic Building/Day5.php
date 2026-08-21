<?php
//Write a function isPrime($number) that returns true if the number is prime, false otherwise.
function isPrime($number){
    $count = 0;
    if($number <= 1){
        return false;
    }
    if($number === 2){
        return true;
    }
    for($i=2; $i<$number; $i++){
        if($number % $i === 0){
        $count++; 
        }
    }
    if($count === 0){
        return true;
    }
    else{
        return false;
    }
}
echo isPrime(2);