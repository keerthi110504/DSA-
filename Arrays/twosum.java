//---------------------------------bruteforce
// class twosum
// {
//     public static void main(String args[])
//     {
//         int arr[]={2,7,11,15};
//         int target=18;
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i+1;j<arr.length;j++)
//             {
//                 if(arr[i]+arr[j]==target)
//                 {
//                     System.out.println(i+","+j);
//                 }
//             }
//         }
//     }
// }
//--------------------------------------using hashmap
class twosum
{
    public static void main(String args[])
    {
        int arr[]={3,2,4};
        int target=6;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement = target - arr[i];
            if(hm.containsKey(complement))
            {
                
            }
        }

        
        
    }
}