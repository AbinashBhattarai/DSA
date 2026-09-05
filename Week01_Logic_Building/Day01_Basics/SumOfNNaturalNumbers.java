/*
Question: Find sum of first N natural numbers

Explanation:
- initialize sum = 0
- use a loop
- iterate the loop from 1 till the given number(upper limit)
- go on adding each number to the sum (sum = sum+i)

TC = O(n)
SC = O(1)
*/


public class SumOfNNaturalNumbers
{
    public static void main(String[] args)
    {
        int num = 10;
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum += i;
        }
        System.out.println("The sum from 1 to " + num + " is " + sum);
    }
}