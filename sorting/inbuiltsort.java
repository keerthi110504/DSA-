
import java.util.Arrays;
import java.util.Collections;
class inbuiltsort
{
    public static void main(String args[])
    {
        int arr[]={4,7,3,2};
        Integer arr[]={4,7,3,2};
        
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,1);
        Arrays.sort(arr,Collections.reverseOrder());
        Arrays.sort(arr,0,1,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
       