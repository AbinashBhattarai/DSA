/*
Question: Count zeroes in a positive number

Explanation:
- if n % 10 == 0 then increase zeroesCount
- iterate n/10 to remove digits

TC = O(log n)
SC = O(1)
*/


public class CountZeroes
{
    public static void main(String[] args)
    {
        int num = 1122004455;
        int zeroesCount = 0;

        if(num == 0)
        {
            zeroesCount = 1;
        }
        else
        {
            while(num > 0)
            {
                if(num % 10 == 0)
                {
                    zeroesCount++;
                }
                num = num / 10;
            }
        }
        System.out.println(zeroesCount);
    }
}