/*
Question: Count total number of digits in a given number.

Explanation:
- divide the number by 10 inside the loop and run the loop till num > 0 
- each iteration removes one digit
- count loop iteration

TC = O(log n)
SC = O(1)
*/

public class CountDigits
{
    public static void main(String[] args)
    {
        int num = -112233;
        int count = 0;

        //check negative condition
        if(num < 0)
        {
            num = Math.abs(num);
        }

        //check for 0
        if(num == 0)
        {
            count = 1;
        }
        else
        {
            while(num > 0)
            {
                num = num/10;
                count++;
            }
        }
        System.out.println(count);
    }
}
