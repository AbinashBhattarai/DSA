// Find the number of occurence of characters and numbers
class Program{
    public static void Main(){
        
        int[] numbers = [1,3,2,4,1,3,5];        
        string letters = "abfgabdd";
        Check(numbers, letters);
    }

    // Using normal array
    /*
    public static void Check(int[] num, string ltr){
        int[] countNum = new int[num.Length+1];
        int[] countLtr = new int[26];

        for(int i=0; i<num.Length; i++){
            countNum[num[i]]+=1; 
        }

        for(int i=0; i<ltr.Length; i++){
            countLtr[ltr[i]-'a']+=1; 
        }

        Console.WriteLine("Number \t\t\t Occurence");
        for(int i=0; i<countNum.Length; i++){
            Console.WriteLine($"{i} \t\t\t {countNum[i]}");
        }
        
        Console.WriteLine("\nLetter \t\t\t Occurence");
        for(int i=0; i<countLtr.Length; i++){
            Console.WriteLine($"{i+'a'} \t\t\t {countLtr[i]}");
        }
    }
    */


    // Using Dictionary
    
    public static void Check(int[] num, string ltr){

        Dictionary<int, int> countNum = new Dictionary<int, int>();
        Dictionary<char, int> countLtr = new Dictionary<char, int>();

        foreach (int n in num)
        {
            countNum.TryGetValue(n, out int value);
            countNum[n] = value+1;
        }

        foreach(char c in ltr){
            countLtr.TryGetValue(c, out int value);
            countLtr[c] = value+1;
        }

        Console.WriteLine("\nNumber \t\t\t Occurence");
        foreach(var i in countNum){
            Console.WriteLine($"{i.Key} \t\t\t {i.Value}");
        }
        
        Console.WriteLine("\nLetter \t\t\t Occurence");
        foreach(var i in countLtr){
            Console.WriteLine($"{i.Key} \t\t\t {i.Value}");
        }
    }
}