/*
Question: Check whether a year is a Leap Year

Explanation:
- if divisible by 4 may be a leap year
- but must not be disible by 100
- after above condition if the year is divisible by 400 it is a leap year

TC = O(1)
SC = O(1)
*/



public class LeapYear
{
    public static void main(String[] args)
    {
        int year = 2000;

        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}