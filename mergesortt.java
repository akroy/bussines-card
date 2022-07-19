public class mergesortt {
    // here we write the merge sort algorithm
    // so lets start

    public static void merge(int arr[],int l,int mid,int r)
    {
        int n1= mid-l+1; // this is first sorted array length
        int n2= r-mid;// this is second sorted array length
        // now i create two dummy array to stor the two sorted array
        int a[]=new int[n1];
        int b[]=new int[n2];
        // now i store first sotrted array vlue in first array
        for(int i=0;i<n1;i++)
        {
            a[i]=arr[l+i];

        }
        // same for b
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+1+i];
            
        }
        int i=0;// this pointer point first element of first array
        int j=0;// thsi pointer point first element of second array
        int k=l;// this is for main array
        while(i<n1&&j<n2)
        {
            if(a[i]<b[j])
            {
                arr[k]=a[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=b[j];
                k++;
                j++;
            }
        }
        // in case of one array is larger then another then compiler come tho these while loop 
        
        while(i<n1)
        {
            arr[k]=a[i];
                k++;
                i++;
        }
        while(j<n2)
        {
            arr[k]=b[j];
                k++;
                j++;
        }

    }

    // from here we write the merge sort function 

    public static void mergesort(int arr[],int l,int r) // this is merge sort function
    {
        if(l<r)
        {
            int mid= (l+r)/2; // this gives us mid index  of array 

            mergesort(arr,l,mid); // this fucntion gives us 1st sorted array
            mergesort(arr,mid+1,r);// this fucntion gives us 2nd sorted array
            // after we get two sorted array i create another fucntion to merge 
            //these two sorted array

            merge(arr,l,mid,r); // this function merge two sorted array

            // and from above two recusion function we got the two sorted aarray 

        }


    }
    public static void main(String[] args) {
        int a[]={4,5,6,1,2,9};
        int n=6;
        int l=0;
        int r=n-1;
        mergesort(a,l,r); // here i call the mergesort function.
        // this function give us a sorted array using merge sort
        // after getting sorted array need to print
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
    
}
