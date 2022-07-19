public class insertion {
    // here we write code for insertion sort algorithm 
    // so lets start 

    // now here we create in_sort function 

    public static void in_sort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }


    }
    public static void main(String[] args) {
        int a[]={8,5,4,7,1};
        int n=5;
        in_sort(a,n); // this is insort function that gives us sorted array
        // now we need t o print the sorted array
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
    

