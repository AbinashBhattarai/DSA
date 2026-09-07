/*
Question: Find the factorial of a given number

Explanation:
- use loop and multiply numer from 1 to n

TC = O(n)
SC = O(1)
 */


public class Factorial
{
    public static void main(String[] args)
    {
        int num = 9;
        int fact = 1;

        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}