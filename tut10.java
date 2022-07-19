public class tut10 {
    // here we write the code for merge sort algorithm
    // so lets start


    // this is merge function
    public static void merge(int arr[],int l,int mid,int r)
    {
        // here we create the two dummy array and 
        // add those sorted array element in these tow dummy array

        int n1= mid-l+1;
        int n2= r-mid;

        int a[]= new int[n1];
        int b[]=new int[n2];
       // here i add element in dummy array

        for(int i=0;i<n1;i++)
        {
            a[i]=arr[i+l];
        }
        for(int i=0;i<n2;i++)
        {
            b[i]=arr[mid+1+i];
        }
        // now i have two sorted array in two dummy array called a and b
        // now i write code for merge two array
        int i=0; // two pointer first points to first element in array a
        int j=0;
        int k=l;
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

  // here we write the function for the merge sort 

 public static void merg_sort(int arr[],int l,int r)
 {
     // this is base case
     if(l<r)
     {
         int mid= (l+r)/2;
         merg_sort(arr,l,mid); // these two gives us two sorted array
         merg_sort(arr,mid+1,r);

         merge(arr,l,mid,r);// and thsi fucntion do merge two sorted array 
     }

 }

    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,5};
        int n=7;
        int l=0;
        int r=n-1;
        merg_sort(a,l,r); // this function gives us a sorted array using merge sort

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }


    }
   
    
}
