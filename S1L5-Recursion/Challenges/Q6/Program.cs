// Q: Reverse an array


// Sol: using new array
// public class Program
// {
//     public static void Main()
//     {
//         int[] arr = [1,2,3,4,5,6];
//         Reverse(arr);
//     }

//     public static void Reverse(int[] arr)
//     {
//         int[] newArr = new int[arr.Length];

//         for (int i = 0; i < arr.Length; i++)
//         {
//            newArr[i] = arr[arr.Length - i - 1];
//         }

//         foreach (int i in newArr)
//         {
//             Console.Write(i + " ");
//         }
//     }
// }



// Sol: Using two pointer approach
// public class Program
// {
//     public static void Main()
//     {
//         int[] arr = [1,2,3,4,5,6];
//         Reverse(arr);
//     }

//     public static void Reverse(int[] arr)
//     {

//         int start = 0;
//         int end = arr.Length - 1;
//         int temp;

//         while(start < end)
//         {
//             temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }

//         foreach (int i in arr)
//         {
//             Console.Write(i + " ");
//         }
//     }
// }


// Sol: Using recursion
public class Program
{
    public static void Main()
    {
        int[] arr = [1,5,8,7,9];
        Reverse(arr, 0, arr.Length-1);

        foreach (int i in arr)
        {
            Console.Write(i + " ");
        }
    }

    public static void Reverse(int[] arr, int start, int end)
    {

        if(start > end)
        {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        Reverse(arr, start + 1, end - 1);
    }
}

