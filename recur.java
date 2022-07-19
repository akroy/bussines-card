import java.util.*;
public class recur {
    public static void print(int n)
    {
        if(n > 0)
        {
            print(n - 1);
            System.out.print(n + " ");
        }
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        print(n);
    }
    
}
