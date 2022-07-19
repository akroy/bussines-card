public class quicksort {
    public static int partison(int arr[],int l,int h)
    {
        int pi= arr[l];
        int i=l;
        int j=h+1;
        while(i<j)
        {
            do
            {
                i++;
            }while(arr[i]<=pi);
            do
            {
                j--;
            }while(arr[j]>pi);

            if(i<j)
            {
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int t= arr[l];
        arr[l]=arr[j];
        arr[j]=t;

        return j;
    }
    public static void quickSort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int j= partison(arr,l,h);

            quickSort(arr,l,j-1);
            quickSort(arr,j+1,h);
        }
    }
    public static void main(String[] args) {
        int a[]={55,66,3,66,88,6};
        int n=6;
        int l=0;
        int h=n-1;
        quickSort(a,l,h);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
