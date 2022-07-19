import java.util.*;
public class priortyqueue {
    // N = 6
    // arr[] = 7 10 4 3 20 15
    // K = 3
    public static int getkthsmall(int arr[],int n,int k)
    {
        // here we write the simplesent method to find the kth smmalest element in the array 
        // we can also can say that this is bruet force method
        // from broute force method we get the result only in 2 line of cade 
        // here are the two line cod e


        // Arrays.sort(arr);
        // return arr[k-1];
        PriorityQueue<Integer>p= new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            int x= arr[i];
            p.add(x);
        }
       
        while(k>1)
        {
             
             p.poll();
             k--;
        }
        return p.peek();
   

    }
    public static void main(String[] args) {
        // in this problem we have to find the kth smallest element in the array;

        int n=6;
        int arr[]={7,10,4,3,20,15};
        int k=3;
        int kel= getkthsmall(arr,n,k);
        System.out.println(kel);

        // output is 7
    }
    
}
