import java.util.*;

public class bubblesort {
    public static void bubbls(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter"+n+"element for array");
        for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }

        bubbls(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
}
