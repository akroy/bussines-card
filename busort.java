
public class busort {
    // here i write the bubble sort algorithm 
    public static void bb_sort(int arr[],int n)
    {
        // this for loop for the itteration 

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1]) // this function check the if element at 0th index is 
                // greeater then the index of first position element the swap the these two function
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }

        } 
    }


   public static void main(String[] args) {
       int a[]={44,55,6,3,22,6,7,1};
       int n=8;
       bb_sort(a,n);
       for(int i=0;i<n;i++)
       {
           System.out.print(a[i]+" ");
       }
   }
}
