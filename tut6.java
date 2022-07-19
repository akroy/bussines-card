public class tut6 {
    // here we write the bubble sort algorithm


    // now here we write the b_sort function
    public static void b_sort(int a[],int n)
    {
        for(int i=0;i<n-1;i++) // this for looop for iteration 
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int a[]={1,4,3,66,43,22};
        int n=6;
        b_sort(a,n);

        // this for loop for the printing the  sorted array.
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
