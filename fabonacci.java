import java.util.Scanner;

public class fabonacci {
    // here we want to print the fabbonacci series o f no
    public static int fab(int n)
    {
        if(n==1||n==2)
        return 1;
    return fab(n-1)+fab(n-2);
    // if we want to print the 5th term then we need to add 3rd and 4th term as well


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(fab(i)+" ");// this will print ith term every time

        }
        
    }
    
}
