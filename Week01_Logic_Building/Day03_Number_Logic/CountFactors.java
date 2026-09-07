 /* 
 Question: Count the total number of factors of a given number.

 Explanation:
- factors divide the number withour remainder
- iterate through 1 to number
- if number is divisible without remainder increase the count

TC = O(N)
SC = O(1)
 */


public class CountFactors
{
    public static void main(String[] args)
    {
        int num = 24;
        int count = 0;

        for(int i=1; i<=num; i++)
        {
            if(num % i == 0)
            count++;
        }
        System.out.println("Total factors of " + num + " is " + count);
    }
}