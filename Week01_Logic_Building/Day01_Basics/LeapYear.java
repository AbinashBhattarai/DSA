//Question: Check if the year is leap year or not.

public class LeapYear
{
    public static void main(String[] args)
    {
        int year = 1996;

        //step1: check if the year is divisible by 4
        if(year % 4 == 0)
        {
            //step2: now we need to check if the year is a century year or not (eg. 1900, 2000)
            if(year % 100 == 0)
            {
                //step3: now we need to check if the century year is divisible by 400 or not
                if(year % 400 == 0)
                {
                    //if the century year is divisible by 400, it is a leap year
                    System.out.println(year + " is a leap year."); 
                }
                else
                {
                    //if the century year is not divisible by 400, it is not a leap year
                    System.out.println(year + " is not a leap year."); 
                }
            }
            else
            {
                //if the year is divisible by 4 and is not a century year, it is a leap year
                System.out.println(year + " is a leap year.");  
            }
        }
        else
        {
            //if the year is not divisible by 4 , it is not a leap year
            System.out.println(year + " is not a leap year.");  
        }

        //alternative solution
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

