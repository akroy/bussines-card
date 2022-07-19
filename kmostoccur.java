import java.util.*;

public class kmostoccur {
    public static void main(String[] args) {
        //  8   size of array
        //  3 1 4 4 5 2 6 1 array with n element 
        //  2 value of k
        // Given an array arr[] of N integers in which
        //  elements may be repeating several times. Also, a positive number K is
        //   given and the task is to find sum of total frequencies of K most occurring elements

        //    Note: The value of K is guaranteed to be less than or
        //   equal to the number of distinct elements in arr.

        Scanner sc= new Scanner(System.in);
        HashMap<Integer,Integer>mp= new HashMap<>();

        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            mp.put(a[i],mp.getOrDefault(a[i],0)+1); // yaad karne yogya baat 
        }
        int k= sc.nextInt();

        PriorityQueue<Integer>p= new PriorityQueue<>();

        //for(Map.Entry<Integer,Integer>it:mp.entrySet())
        mp.forEach((ke,v)->
        {
            //System.out.println(it.getKey()+" "+it.getValue());
            System.out.println(ke+" "+v);
            p.add(v);
        });
        int sum=0;
        for(int i=1;i<=k;i++)
        {
            sum+=p.peek();
            p.poll();

        }
        System.out.println(sum);


    }
    
}
