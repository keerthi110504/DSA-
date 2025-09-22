/*Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3 Output:-1*/
//----------------------------------------------brute force
// class elementatindex
// {
//     public static void main(String args[])
//     {
//         int arr[]={4,5,6,7,0,1,2};
//         int target=3;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==target)
//             {
//             System.out.println(arr[i]);
//             }
//         }
//         System.out.println(-1);
//     }
// } 
//--------------------------------------------- 
// import java.util.*;
//  class elementatindex
// {
//     public static void main(String args[])
//     {
//         int arr[]={4,5,6,7,0,1,2};
//         int target=3;
//         Arrays.sort(arr);
//         if(target==arr[target+1])
//         {
//             System.out.println( target+1);
//         }
//        System.out.println(-1);
        
//     }
// } 
//--------------------------------binarysearch approch
class searchinarotatedsortedarray
{
    public static int search(int arr[],int target)
    {
        int n=arr.length;
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[l]<=arr[mid])
            {
                if(target>=arr[l] && target<arr[mid])
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else
            {
                if(target>arr[mid] && target<=arr[h])
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }
            

        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(search(arr,target));
    }
}