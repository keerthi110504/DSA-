class binarysearch
{
    public static int binarysearch(int arr[],int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,4,6,8,10};
        int target=19;
        System.out.println(binarysearch2(arr,target));
    }
}