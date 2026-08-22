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

//Given an array of numbers, e.g. [4, 7, 2, 9, 5], find and print the second largest number — 
// without sorting the array (write the logic with a loop).
$numbers = [9, 1, 2, 8, 3];
echo "The given array of is: <br>";
foreach($numbers as $number){
    echo $number;
}
$largestNum = $numbers[0];
$secLargestNum = PHP_INT_MIN;
for($i=1; $i<count($numbers); $i++){
    if($numbers[$i]>$largestNum){
        $secLargestNum = $largestNum;
        $largestNum = $numbers[$i];
    }
    elseif($numbers[$i]>$secLargestNum){
        $secLargestNum = $numbers[$i];
    }
}
echo "<br>The second highest number in the array is: $secLargestNum";

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

//Write a function countVowels($str) that counts and returns how many 
//vowels (a, e, i, o, u — case-insensitive) appear in a string.
function countVowel($string){
    $vowel = ["a", "e", "i", "o", "u"];
    $count = 0;
    $newString = strtolower($string);
    for($i=0; $i<strlen($newString); $i++){
        if(in_array($newString[$i], $vowel)){
            $count++;
        }
    }
    return $count;
}
echo countVowel("Abinash");

//Write a function isPalindrome($str) that returns true if a string reads the same forwards 
// and backwards (e.g., "level", "madam"), false otherwise — without using strrev(). 
function isPalindrome($string){
    $i = 0;
    $j = strlen($string)-1;
    $string = strtolower($string);
    while($i<$j){
        if($string[$i] !== $string[$j]){
            return false;
        }
        $i++;
        $j--;
    }
    return true;
}
$checkPalindrome = isPalindrome("Aba") ? "Palindrome" : "Not Palindrome" ;
echo $checkPalindrome;

//Refactor your Day 3 FizzBuzz logic into a function fizzBuzz($n) that returns an array of the 
//results (not echo directly), for numbers 1 to $n. Then loop through the returned array 
//separately to display it. This combines functions + arrays + control flow — 
//a good "everything so far" check.
function fizzBuzz($num){
    $result = [];
    for($i=1; $i<=$num; $i++){
        if($i % 3 === 0 && $i % 5 === 0){
            array_push($result, "FizzBuzz");
        }
        elseif($i % 3 === 0){
            array_push($result, "FIzz");
        }
        elseif($i % 5 === 0){
            array_push($result, "Buzz");
        }
        else{
            array_push($result, "$i");
        }
    }
    return $result;
}

function printResult($array){
    foreach($array as $arr){
        echo $arr . "<br>";
    }
}

$fizzBuzzResult = fizzBuzz(30);
printResult($fizzBuzzResult);


