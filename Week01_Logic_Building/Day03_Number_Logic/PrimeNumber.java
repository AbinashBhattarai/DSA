 /* 
Question: Check whether a given number is prime
**A number which is divisible by 1 and itself is prime number(have only 2 factors)
**1 is not prime coz it has only one factor i.e. itsel

Explanation:
- if num is smaller or equal to 1 then it is not prime
- iterate through 2 -> num/2(half of number)
- if any number divide the given number without remainder then the given number is not prime

TC = O(n)
SC = O(1)
*/

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num = 101;
        boolean isPrime = true;

        if(num <= 1)
        {
            isPrime = false;
        }

        for(int i=2; i*i<=num; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is not Prime");
        }
    }
}