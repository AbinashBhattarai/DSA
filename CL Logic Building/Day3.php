/*
Write a loop from 1 to 30. For each number:
If divisible by 3, print "Fizz"
If divisible by 5, print "Buzz"
If divisible by both 3 and 5, print "FizzBuzz"
Otherwise, print the number itself
*/

<?php
    for($i=1; $i<=30; $i++){
        if($i % 3 === 0 && $i % 5 === 0){
            echo "FizzBuzz";
        }
        elseif($i % 3 === 0){
            echo "FIzz";
        }
        elseif($i % 5 === 0){
            echo "Buzz";
        }
        else{
            echo "$i";
        }
        echo "<br>";
    }