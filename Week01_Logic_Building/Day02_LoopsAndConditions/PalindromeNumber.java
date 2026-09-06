 /*
 Question: Check whether a number is a palindrome

 Explanation:
 - reverse the number (extract the digit by n%10 and append the digit in reverse*10)
 - compare original and reverse number
 - if equal then the number is palindrome

 TC = O(log n)
 SC = O(1)
 */


 public class PalindromeNumber
 {
    public static void main(String[] args)
    {
        int num = 000;
        int original = num;
        int reverse = 0;

        while(num > 0)
        {
            int digit = num % 10; //extract last digit
            reverse = reverse * 10 + digit; //append the last digit
            num = num / 10; //remove the last digit
        }
        if(original == reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");  
        }
    }
 }