/*
Question: Count number of vowels in a given string

Explanation:
- iterate through string and match vowel condition with each character

TC = O(N)
SC = O(1)
*/

public class CountVowels
{
    public static void main(String[] args)
    {
        String input = "aeibcd";
        int vowelCount = 0;

        for(int i=0; i<input.length(); i++)
        {
            char ch = Character.toUpperCase(input.charAt(i));
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}