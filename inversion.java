import java.util.*;

public class inversion {

    public static long merge(int arr[],int l,int mid,int r)
    {
        long inv=0;

        int n1=mid-l+1;
        int n2=r-mid;
        int a[]= new int[n1];
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
        while(i<n1 && j<n2)
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
                inv+= n1-i;
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
        return inv;

    }
    public static long mergesort(int a[],int l,int r)
    {
        long inv=0;

        if(l<r)
        {
            int mid= (l+r)/2;
            inv+= mergesort(a,l,mid);
            inv+= mergesort(a,mid+1,r);

            inv+= merge(a,l,mid,r);

        }
        return inv;
    }
    public static void main(String[] args) {
        int a[]={2, 4, 1, 3, 5};
        int n=5;
        int l=0;
        int r=n-1;

       long x= mergesort(a,l,r);

    //   for(int i=0;i<n;i++)
    //   {
    //       System.out.print(a[i]+" ");
    //   }
    System.out.println(x);
    }
    
}
