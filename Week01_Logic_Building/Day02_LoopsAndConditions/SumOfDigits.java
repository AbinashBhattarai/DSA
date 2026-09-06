 /*
 Question: Find the sum of digits of a given positive number.

 Explanation:
 - extract last digit by n % 10
 - add last digit to sum
 - remove last digit by n / 10

 TC = O(log n)
 SC = O(1)
 */


public class SumOfDigits
{
    public static void main(String[] args)
    {
        int num = 123456;
        int sum = 0;

        while(num > 0)
        {
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println(sum);
    }
}