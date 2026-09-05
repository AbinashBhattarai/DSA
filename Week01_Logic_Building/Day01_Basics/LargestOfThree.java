/*
Question: Find largest of three numbers

Explanation:
- compare first number with other two number
- if not largest check second
- else third is largest

TC = O(1)
SC = O(1)
*/

public class LargestOfThree
{
    public static void main(String[] args)
    {
        int a=18, b=10, c=8;
        if(a >= b && a >= c)
        {
            System.out.println(a + " is the largest number.");
        }
        else if(b >= a && b >= c)
        {
            System.out.println(b + " is the largest Number.");
        }
        else
        {
            System.out.println(c + " is the largest Number.");
        }
    }
}