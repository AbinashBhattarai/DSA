/*
Question: Count even digits in a number

Explanation:
- iterate n % 10 to extract each digit
- if digit % 2 == 0 increase evenCount
- iterate n / 10 to remove extracted digit from n
- iterate the loop until n > 0

TC = O(log n)
SC = O(1)
*/


public class CountEvenDigits
{
    public static void main(String[] args)
    {
        int num = 112233;
        int evenCount = 0;

        //check negative condition
        if(num < 0)
        {
            num = Math.abs(num);
        }

        //check for 0
        if(num == 0)
        {
            evenCount = 1;
        }
        else
        {
            while(num > 0)
            {
                int digit = num % 10;
                if(digit % 2 == 0)
                {
                    evenCount++;
                }
                num = num / 10;
            }
        }
        System.out.println(evenCount);
    }
}