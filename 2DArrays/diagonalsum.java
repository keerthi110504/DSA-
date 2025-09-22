//---------------------------------bruteforce
// class diagonalsum
// {
//     public static void sum(int arr[][])
//     {
//         int m=arr.length;
//         int n=arr[0].length;
//         int total=0;
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             {
//                 if(i==j)
//                 {
//                     total+=arr[i][j];
//                 }
//                 else if((i+j)==n-1)
//                 {
//                     total+=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(total);
//     }
//     public static void main(String args[])
//     {
//         int arr[][]={
//             {1,2,3,0},
//             {4,5,6,0},
//             {7,8,9,0},
//             {0,0,0,0}
//         };
//         sum(arr);
//     }
// }
//---------------------------------optimized
// class diagonalsum
// {
//     public static void sum(int arr[][])
//     {
//         int m=arr.length;
//         int n=arr[0].length;
//         int total=0;
//         for(int i=0;i<m;i++)
//         {
//             total+=arr[i][i];
//             if(i!=n-i-1)
//             {
//                 total+=arr[i][n-i-1];
//             }

//         }
//         System.out.println(total);
//     }
//     public static void main(String args[])
//     {
//         int arr[][]={
//             {1,2,3,0},
//             {4,5,6,0},
//             {7,8,9,0},
//             {0,0,0,0}
//         };
//         sum(arr);
//     }
// }
//-----------------------------------------------
class diagonalsum
{
    public static int sum(int arr[][])
    {
        int totalsum=0;
        for(int i=0;i<arr.length;i++)
        {
            //primary diagonal
            totalsum+=arr[i][i];
            //secondary diagonal
            totalsum+=arr[i][arr.length-i-1];
              
        }
        //if matrix is odd
        //subtract tye duplicate element
        if(arr.length%2!=0)
        {
            totalsum-=arr[arr.length/2][arr.length/2];//subtracting the middlemost element 
        }
        return totalsum;
    }
    public static void main(String args[])
    {
        int arr[][]={
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };
        System.out.println("diagonalsum is:" +sum(arr));
    }
}

