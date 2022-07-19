public class quicks {
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
            do {
                j--;
                
            } while(arr[j]>pi);
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
    public static void quick_sort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int j= partison(arr,l,h);
            quick_sort(arr,l,j-1);
            quick_sort(arr,j+1,h);

        }
    }
    public static void main(String[] args) {
        int a[]={66,7,4,33,2,22,70,90};
        int n=8;
        int l=0;
        int h=n-1;

        quick_sort(a,l,h);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
