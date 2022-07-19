public class insertionsort {

    public static void insort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int key= arr[i];
            int j= i-1;
            while(j>=0&&arr[j]>key)
            {   
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int a[]= {33,2,44,56,7,88,99};
        int n=7;
        insort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
