// Print name ith times
/*
class Program{
    public static void Main(){
        int n = 5;
        Print(n);
    }

    public static void Print(int i){
        if(i<1){
            return;
        }

        Console.WriteLine("Hello");
        Print(i-1);
    }
}
*/


// Print 1 to n (linear)
/*
class Program{
    public static void Main(){
        int n = 5;
        Print(1, n);
    }

    public static void Print(int i, int j){
        if(i>j){
            return;
        }

        Console.WriteLine(i);
        Print(i+1, j);
    }
}
*/


// Print n to 1 (linear)
/*
class Program{
    public static void Main(){
        int n = 5;
        Print(n);
    }

    public static void Print(int i){
        if(i<1){
            return;
        }

        Console.WriteLine(i);
        Print(i-1);
    }
}
*/


// Print 1 to n (backtracking)
/*
class Program{
    public static void Main(){
        int n = 5;
        Print(n);
    }

    public static void Print(int i){
        if(i<1){
            return;
        }

        Print(i-1);
        Console.WriteLine(i);
    }
}
*/


// Print n to 1 (backtracking)
/*
class Program{
    public static void Main(){
        int n = 5;
        Print(1, n);
    }

    public static void Print(int i, int j){
        if(i>j){
            return;
        }

        Print(i+1, j);
        Console.WriteLine(i);
    }
}
*/


// Print sum of first n numbers (parameterized recursion)
/*
class Program{
    public static void Main(){
        int n = 3;
        Sum(n, 0);
    }

    public static void Sum(int i, int sum){
        if(i<1){
            Console.Write(sum);
            return;
        }

        Sum(i-1, sum+i);
    }
}
*/


// Print sum of first n numbers (functional recursion)
/*
class Program{
    public static void Main(){
        int n = 3;
        Console.Write(Sum(n));
    }

    public static int Sum(int i){
        if(i<1){
            return 0;
        }

        return i + Sum(i-1);
    }
}
*/


// Print factorial of given number
/*
class Program{
    public static void Main(){
        int n = 4;
        Console.Write(Fact(n));
    }

    public static int Fact(int i){
        if(i < 1){
            return 1;
        }

        return i * Fact(i-1);
    }
}
*/


// Reverse an array
/*
class Program{
    public static void Main(){
        int[] a = [1,7,8,5];
        // RevArr(a);
        // RevArr(a, 0, a.Length-1);
        RevArr(a, 0);
    }

    // Normal Approach
    /*
    public static void RevArr(int[] arr){

        // Creating new array (non in-place)
        // int[] newArr = new int[arr.Length];
        // for(int i=0; i<arr.Length; i++){
        //     newArr[i] = arr[arr.Length-i-1];
        // }
        // PrintArr(newArr);


        // Using loop (in-place)
        int start = 0;
        int end = arr.Length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }       
        PrintArr(arr);
        
    } 
    */

// Using recursive approach (two variables)
/*
public static void RevArr(int[] arr, int i, int j){
    if(i>j){
        PrintArr(arr);
        return;
    }

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]= temp; 
    RevArr(arr, i+1, j-1);
}
*/

// Using recursive approach (one variables)
/*
public static void RevArr(int[] arr, int i){
    if(i >= arr.Length/2){
        PrintArr(arr);
        return;
    }

    int temp = arr[i];
    arr[i] = arr[arr.Length-i-1];
    arr[arr.Length-i-1]= temp; 
    RevArr(arr, i+1);
}

public static void PrintArr(int[] arr){
    foreach(int a in arr){
        Console.Write(a + " ");
    }
}
}
*/


// Check palindrome
/*
class Program{
    public static void Main(){
        string a = "madam";
        Check(a);
    }

    public static void Check(string s){
        int i = 0;
        Console.Write(CheckP(s, i));
    }

    public static bool CheckP(string s, int i){
        if(i > s.Length/2){
            return true;
        }
        if(s[i] != s[s.Length-i-1]){
            return false;
        }

        return CheckP(s, i+1);
    }
}
*/


// Print fibonacci series upto nth term normal approach
/*
class Program{
    public static void Main(){
        int n = 8;
        Fib(n);
    }

    public static void Fib(int n){
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        Print(arr);
    }

    public static void Print(int[] arr){
        foreach(int a in arr){
            Console.Write(a + " ");
        }
    }
}
*/


// Print fibonacci series upto nth term using recursion
class Program{
    public static void Main(){
        int n = 4;
        for(int i=0; i<n; i++){
            Console.Write(Fib(i) + " ");
        }
    }

    public static int Fib(int n){
        if(n <= 1){
            return n;
        }

        return Fib(n-1) + Fib(n-2);
    }
}

