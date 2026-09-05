/*
Question: Print numbers from 1 to N

Explanation:
- use a loop
- iterate the loop from 1 till the given number(upper limit)
- print the value of i inside loop 

TC = O(n)
SC = O(1)
*/


public class Print1ToN
{
    public static void main(String[] args)
    {
        int num = 15; //Upper Limit

        for(int i=1; i<=num; i++)
        {
            System.out.println(i);
        }
    }
}