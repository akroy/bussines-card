public class ins {
    //this sorting algorithm is called the insertion sort algorithm
    // in this algorithm we store the value of 0th index element with index  of 1 index elemen 
    
    public static void in_sort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }

    public static void main(String[] args) {
        int a[]={22,3,1,33,4,5,66};
        int n=7;
        in_sort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
//this is ankaj kumar ray and today is 18 04 2022 and 
// here i write the 4 main type of sorting algorithm
// merge sort algorithm 
// insertion sort algoarithm 
// bubble sort algorithm 
// quick sort algorithm 
// another is called heap sort algorithm in this toutorial we will not write the heap sort algorithm

