class linearsearch{
    public static int search(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;} 
    public static void main(String args)
    {
        int arr[]={2,4,6,8,10};
        int target=10;
        System.out.println(search(arr,target));
    }
}