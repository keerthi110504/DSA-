//-------------bruteforce
// class trappingrainwater
// {
//     public static int trap(int arr[])
//     {
//         int res=0;
//         for(int i=1;i<arr.length-2;i++)
//         {
//            int lb=arr[i];
//            for(int j=0;j<i;j++)
//            {
//             if(arr[j]>lb)
//             {
//                 lb=arr[j];
//             }
//            } 
//            int rb=arr[i];
//            for(int j=i+1;j<arr.length;j++)
//            {
//             if(arr[j]>rb)
//             {
//                 rb=arr[j];
//             }
//            } 
//            int wl;
//            if(rb>lb)
//            {
//             wl=lb;
//            }
//            else
//            {
//             wl=rb;
//            }
//            int tw=wl-arr[i];
//            res+=tw;
//         }
//         return res;
//     }
//     public static void main(String args[])
//     {
//         int arr[]={4,2,0,3,2,5};
//         System.out.println(trap(arr));
//     }
// }
//-------------------------prefix and suffix arays
// class trappingrainwater
// {
//     public static int trap(int arr[])
//     {
//         int prefixmax[]=new int[arr.length];
//         prefixmax[0]=arr[0];
        
//         for(int i=1;i<arr.length;i++)
//         {
//             prefixmax[i]=Math.max(arr[i],prefixmax[i-1]);
//         }
//         int suffixmax[]=new int[arr.length];
//         suffixmax[arr.length-1]=arr[arr.length-1];
//         ///int res=0;
//         for(int i=n-2;i>=0;i--)
//         {
//             sufffixmax[i]=Math.max(arr[i],suffixmax[i+1]);
//         }
//         int tw=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             int wl=Math.min(prefixmax[i],suffixmax[i]);
//             tw+=wl-arr[i];
//         }
//         return tw;
           
//     }
//     public static void main(String args[])
//     {
//         int arr[]={4,2,0,3,2,5};
//         System.out.println(trap(arr));
//     }
// }
//-------------------------2-pointer
class tarpingrainwater
{
    public static int trap(int arr[])
    {
        int n=arr.length;;
        int leftmax=arr[0];
        int rightmax=arr[n-1];
        int i=1;
        int j=n-2;
        int tw=0;
        while(i<=j)
        {
           if(leftmax<=rightmax)
           {
            if(leftmax>arr[i])
            {
                tw+=(leftmax-arr[i]);
            }
            else
            {
                leftmax=arr[i];
            }
            i++;
           }
           else
           {
            if(rightmax>arr[i])
            {
                tw+=(rightmax-arr[j]);
            }
            else
            {
                rightmax=arr[j];
            }
            j++;
           }
           
        }
        return tw;
    }
    public static void main(String args[])
    {
        int arr[]={4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
}

