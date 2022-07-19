import java.util.Scanner;

public class fabonicci {
    // here we want to print fabonnaci no without using the recusion method 
    // 1 1 2 3 5 8 13 21 ...... these type of series called fabonacci series
    public static int fab(int n)
    {
        if(n==1||n==2)
         return 1;

        return fab(n-1)+fab(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(fab(i)+" ");
        }
    }
    
}
