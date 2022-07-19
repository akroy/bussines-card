public class tute45 {
    public static void merge(int arr[],int l,int mid,int r)
    {
        int n1= mid-l+1;
        int n2= r-mid;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1&&j<n2)
        {
            if(a[i]<b[j])
            {
                arr[k]=a[i];
                i++;
                k++;
            }
            else
            {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
       while(i<n1)
       {
        arr[k]=a[i];
        i++;
        k++;
       }
       while(j<n2)
       {
        arr[k]=b[j];
        j++;
        k++;
       }
    }

        
    public static void megrsort(int a[],int l,int r)
    {
        if(l<r)
        {
            int mid= (l+r)/2;
            megrsort(a, l, mid);
            megrsort(a, mid+1, r);

        merge(a,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int a[]={23,44,1,33,5,66,7};
        int n=7;
        int l=0;
        int r=n-1;

        megrsort(a,l,r);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
