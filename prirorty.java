import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prirorty {

    // Given an array arr[] of N positive integers and a number K. 
    // The task is to find the kth largest element in the array.

    // 5 3
    // 3 5 4 2 9
    public static int getkthlarg(int a[],int n,int k)
    {
        PriorityQueue<Integer>p=new PriorityQueue<>();
        
        for(int i=0;i<n;i++)
        {
            p.add(a[i]);
        }
        while(k>1)
        {
            p.poll();
            k--;
        }
        return p.peek();
    }
    public static void main(String[] args) {
        int n=5;
    int k=3;
    int a[]={3,5,4,2,9};
    // Arrays.sort(a);
    // for(int i=0;i<n;i++){
    //     System.out.print(a[i]+" ");

    // }
    // System.out.print(a[k]);
    int x= getkthlarg(a,n,k);
    System.out.println(x);
    
    }

    





    
}
