// Find the number of occurence
class Program{
    public static void Main(){
        
        // int[] arr = [1,3,2,4,1,3,5];
        // int[] query = [1,2,3,4,5];
        // Check(arr, query);
        
        string s = "abfgabdd";
        char[] query = ['a', 'b', 'd', 'f', 'g'];
        Check(s, query);
    }

    // Numbers (Normal hashing approach)
    /*
    public static void Check(int[] a, int[] q){
        int[] count = new int[a.Length+1];


        for(int i=0; i<a.Length; i++){
            count[a[i]]+=1; 
        }


        foreach(int elem in q){
            Console.WriteLine(count[elem]);
        }
        
    }
    */

    // String (Normal hashing approach)
    /*
    public static void Check(string s, char[] q){
        int[] count = new int[26];


        for(int i=0; i<s.Length; i++){
            count[s[i]-'a']+=1; 
        }


        foreach(int elem in q){
            Console.WriteLine(count[elem - 'a']);
        }
    }
    */


    // Using Dictionary (Numbers)
    /*
    public static void Check(int[] a, int[] q){

        Dictionary<int, int> count = [];

        foreach (int i in a)
        {
            if (!count.ContainsKey(i))
            {
                count.Add(i, 1);
            }
            else
            {
                count[i]++;
            }
        }


        foreach (int elem in q)
        {
            Console.WriteLine(count[elem]);
        }
    }
    */

    // Using Dictionary (String)

    public static void Check(string s, char[] q){
        Dictionary<char, int> count = [];


        foreach(char c in s){
            if(!count.ContainsKey(c)){
                count.Add(c, 1);
            }
            else{
                count[c]++;
            }
        }


        foreach(char ch in q){
            Console.WriteLine(count[ch]);
        }
    }
}