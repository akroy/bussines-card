import java.util.*;
public class prob2 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int occr[]=new int[n+1];
        Arrays.fill(arr, 0);
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            occr[arr[i]]++;
        }
        for(int i=0;i<=n;i++)
        {
            if(occr[i]>1)
            {
                System.out.println(i+" "+occr[i]);
            }
        }

    }
    
}
