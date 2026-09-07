 /* 
 Question: Check whether a given positive number is an Armstrong number

 Explanation:
 - find digits count in given number
 - extract the last digit by using %
 - use loop and multiply the last digit by itself from 0->digits count
 - go on adding the result from step 3
 - if result == given number then the number is armstrong else not armstrong 

 TC = O((logn)2)
 SC = O(1)
 */


public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int num = 0;

        if(num == 0)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            int sumWithExpo = getSumWithExponent(num);

            if(num == sumWithExpo)
            {
                System.out.println("Armstrong Number");
            }
            else
            {
                System.out.println("Not Armstrong Number");
            
        }
    }

    //count exponent
    static int getExponent(int n)
    {
        int count = 0;
        while(n != 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }

    //getSumWithExponent
    static int getSumWithExponent(int n)
    {
        int expo = getExponent(n);
        int result = 0;

        while(n != 0)
        {
            int digit = n % 10;
            int digitWithExpo = 1;
            for(int i=0; i<expo; i++)
            {
                digitWithExpo *= digit;
            }
            result += digitWithExpo;
            n /= 10;
        }
        return result;
    }
}
