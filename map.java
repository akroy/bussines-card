import java.security.Key;
import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer,Integer> mp= new HashMap<>();

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
    
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        // for (int i = 0; i < n; i++)
        // {
        //   if(mp.containsKey(arr[i]))
        //   {
        //       mp.put(arr[i], mp.get(arr[i])+1);
        //   }
        //   else
        //   {
        //       mp.put(arr[i], 1);
        //   }
        // }

        for(int i=0;i<n;i++)
        {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        // Traverse through map and print frequencies
        // for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        // {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
       mp.forEach((key,value )->System.out.println(key+" "+value));

    }
    
}
