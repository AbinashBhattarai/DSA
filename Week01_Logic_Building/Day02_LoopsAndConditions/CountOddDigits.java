/*
Question: Count odd digits in a number

Explanation:
- iterate n % 10 to extract each digit
- if digit % 2 != 0 increase oddCount
- iterate n / 10 to remove extracted digit from n
- iterate the loop until n > 0

TC = O(log n)
SC = O(1)
*/


public class CountOddDigits
{
    public static void main(String[] args)
    {
        int num = 112233;
        int oddCount = 0;

        //check for negative
        if(num < 0)
        {
            num = Math.abs(num);
        }
        while(num > 0)
        {
            int digit = num % 10;
            if(digit % 2 != 0)
            {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println(oddCount);
    }
}