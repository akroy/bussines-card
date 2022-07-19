public class quickkk {
    // quick sort algorithm
    public static int partition(int arr[],int l,int h)
    {
        int pi=arr[l];
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
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int te= arr[l];
        arr[l]=arr[j];
        arr[j]=te;

        return j;

    }
    public static void quick_sort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int j= partition(arr,l,h);

            quick_sort(arr,l,j-1);
            quick_sort(arr,j+1,h);
        }
    }
    public static void main(String[] args) {

        int a[]={77,5,5,44,3,5};
        int n=6;
        int l=0;
        int h=n-1;

        quick_sort(a,l,h);

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
