//Question: Print sum of first N natural numbers

public class SumOfNNaturalNumbers
{
    public static void main(String[] args)
    {
        int n = 11;
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += i;
        }

        //using mathematical formula
        int numSum = n * (n+1) / 2; 

        System.out.println("The sum from 1 to " + n + " is " + sum);
        System.out.println("The sum from 1 to " + n + " is " + numSum);
    }
}