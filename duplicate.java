import java.util.*;

public class duplicate {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter size of array");

    int n= sc.nextInt();
    System.out.println("enter "+n+" element");

    int a[]= new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();

    }
    for(int i=0;i<n;i++)
    {
        System.out.print(a[i]+" ");
    }
}
    
}
