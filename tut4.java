public class tut4 {
    // here we write the function for the bubble sort algorithm 
    public static void bsort(int a[],int n)
    {
        for(int i=0;i<n-1;i++) // this for loop for iteration 
        {
            for(int j=0;j<n-1-i;j++) // this for loop for no.of swaping 
            {
                if(a[j]>a[j+1])
                {
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }


    }
    public static void main(String[] args) {
        int a[]={5,6,34,2,3};
        int n=5;
        bsort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
