
import java.util.*;

public class subarr {
    public static void main(String[] args) {
       int n = 6, s = 5;
        int a[] = {10,15,-5,15,-10,5};
        // here we have to find the subarray of given sum or nothing else
        int start=0;
        int csum=0;
        int end=-1;
        HashMap<Integer,Integer>mp= new HashMap<>();
        for(int i=0;i<n;i++)
        {
            csum+=a[i];
            if(csum==s)
            {
                start=0;
                end=i;
                break;
            }
            if(mp.containsKey(csum-s))
            {
                start=mp.get(csum-s)+1; //this is main line here.
                end=i;
                break;
            }
            mp.put(csum, i);
        }
        if(end==-1)
        System.out.println("subarray not found");
        else
        System.out.print(start+" "+end); 

    }
    
}
