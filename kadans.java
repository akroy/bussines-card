import java.util.*;


public class kadans {
    // Given an array Arr[] of N integers. 
    // Find the contiguous sub-array(containing at least one number) which has the 
    // maximum sum and return its sum.

    public static int getmxsum(int arr[],int n)
    {
        int mx_sum= Integer.MIN_VALUE;
       int curr_sum= 0;
       for(int i=0;i<n;i++)
       {
           curr_sum+=arr[i];
           if(mx_sum<curr_sum)
           {
               mx_sum=curr_sum;
           }
           if(curr_sum<0)
           {
               curr_sum=0;
           }
       }
       return mx_sum;
    }
    public static void main(String[] args) {
        
       int n= 5;
       int arr[] = {1,2,3,-2,5};
       int x= getmxsum(arr,n);
       System.out.println(x);


    }


    
}
