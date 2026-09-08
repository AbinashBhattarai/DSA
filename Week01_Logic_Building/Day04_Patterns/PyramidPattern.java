/*
Question: Print pyramid star pattern
  
      *
     * *
    * * *
   * * * *
  * * * * *

*/

public class PyramidPattern
{
    public static void main(String[] args)
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            //space
            for(int space=1; space<=n-i; space++)
            {
                System.out.print(" ");
            }

            //star
            for(int star=1; star<=i; star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}