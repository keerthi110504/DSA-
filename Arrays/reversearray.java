//-----------------------------using two pointer
// class reversearray
// {
//     public static int[] reverse(int arr[])
//     {
//         int start=0;
//         int end=arr.length-1;
//         while(start<end)
//         {
//             int temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;

//         }
//         return arr;

//     }
//     public static void main(String args[])

//     {
//         int arr[]={2,4,6,8,10};
//         System.out.println("Reversed array is:");
//         reverse(arr);
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(arr[i]);
//         }

//     }
// }
//----------------------------------bruteforce----------------------------
class reversearray
{
    public static int[] reverse(int arr[],int rev[])
    {
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            rev[j]=arr[i];
            j++;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        System.out.println("Reversed array is:");
        int rev[]=new int[arr.length];
        reverse(arr,rev);
        for(int i=0;i<rev.length;i++)
        {
            System.out.println(rev[i]);
        }
    }
}