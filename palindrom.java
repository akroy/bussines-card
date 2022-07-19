import java.util.*;

public class palindrom {
    public static boolean ispali(int n)
    {
        int sum=0,r,temp;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(ispali(n))
        System.out.println("palindrom");
        else
        System.out.println("not palindrom");

    }
}
