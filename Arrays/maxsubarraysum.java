//---------------------------bruteforce 
// class maxsubarraysum
// {
//     public static void main(String args[])
//     {
//         int arr[]={2,4,6,8,10};
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i;j<arr.length;j++)
//             {
//                 //int currsum = 0;
//                 for(int k=i;k<=j;k++)
//                 {
//                     currsum+=arr[k];
//                 }
//                 System.out.print(currsum+" ");
//                 if(maxsum<currsum)
//                 {
//                     maxsum=currsum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum subarray sum is: "+maxsum);
//     }
// }
//------------------------prefix sum
// class maxsubarraysum
// {
//     public static void main(String args[])
//     {
//         int arr[]={2,4,6,8,10};
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
//         int prefix[]=new int[arr.length];
//         prefix[0]=arr[0];
//         for(int i=1;i<prefix.length;i++)
//         {
//            prefix[i]=prefix[i-1]+arr[i]; 
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             int start=i;
//             for(int j=i;j<arr.length;j++)
//             {
//                 int end=j;
//                 currsum = start==0?prefix[end]:prefix[end]-prefix[start-1];
//                 // for(int k=i;k<=j;k++)
//                 // {
//                 //     currsum+=arr[k];
//                 // }
//                 //System.out.print(currsum+" ");
//                 if(maxsum<currsum)
//                 {
//                     maxsum=currsum;
//                 }
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum subarray sum is: "+maxsum);
//     }
// }
//----------------------------------kadanes algorithm-----------------------
class maxsubarraysum
{
    public static int maxsubsum(int arr[])
    {
        int maxsum=arr[0];
        int currsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(currsum>=0)
            {
                currsum+=arr[i];
            }
            else {
                currsum=arr[i];
            }
        }
        if(maxsum<currsum)
        {
            maxsum=currsum;
        }
        return maxsum;
    }
    public static void main(String args[])
    {
        int arr[]={-2,-3,-1};
        System.out.println("MAXSUM :"+maxsubsum(arr));
    }
}
//-----------------
// class maxsubarraysum
// {
//     public static int maxsubsum(int arr[])
//     {
//         int maxsum=Integer.MIN_VALUE;
//         int currsum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             currsum+=arr[i];
//             if(currsum<0)
//             {
//                 currsum=0;
//             }
            
//         }
//         if(maxsum<currsum)
//         {
//             maxsum=currsum;
//         }
//         return maxsum;
//     }
//     public static void main(String args[])
//     {
//         int arr[]={-2,-3,-1};
//         System.out.println("MAXSUM :"+maxsubsum(arr));
//     }
// }