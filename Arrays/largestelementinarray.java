class largestelementinarray
{
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}