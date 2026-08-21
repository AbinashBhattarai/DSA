<?php
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
