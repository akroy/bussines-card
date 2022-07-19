import java.util.*;

public class armstrong {
    // armstrong no.
    //if we cube root of any no remindr sum of all its reminder is equal to that no
    // that type of no is called the armstrong no.
    // that's all for armstrong no
    // so lets do armstrong no. code 
    public static boolean isarm(int n)
    {
        int sum=0,r,tem;
        tem=n;


        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(tem ==sum)

        return true;
        else
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(isarm(n))
        System.out.print("this is armstrong no");
        else
        System.out.print("this is not armstrong no");
    }
}
