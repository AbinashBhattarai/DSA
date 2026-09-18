//Question: Find the largest of 3 numbers

public class LargestOfThree
{
    public static void main(String[] args)
    {
        int a = 2, b = 3, c = 1;

        if(a >= b && a >= c)
        {
            System.out.println("The largest number is: " + a);
        }
        else if(b >= a && b >= c)
        {
            System.out.println("The largest number is: " + b);
        }
        else
        {
            System.out.println("The largest number is: " + c);
        }
    }
}
