/*
Question: Check whether a number is Even or Odd

Explanation: 
- use modulo operator(%) on given number
- if the result is 0 -> Even else Odd.

TC = O(1)
SC - O(1)
*/

public class OddEven
{
    public static void main(String[] args)
    {
        int number = 8;

        if(number % 2 == 0)
        {
            System.out.println("The Given Number is Even.");
        }
        else
        {
            System.out.println("The Given Number is Odd.");
        }
    }
}

