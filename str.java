import java.util.*;

public class str {
    public static boolean ispali(String s)
    {
        Stack<Character>st= new Stack<>();
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++)
        {
            st.push(s.charAt(i));
        }
        while(!st.isEmpty())
        {
            str+=st.pop();
        }
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==str.charAt(i))
            cnt++;
        }
       // System.out.print(str);
        if(s.length()==cnt)
        return true;
        else
        return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        if(ispali(s))
        System.out.println("palindrom");
        else
        System.out.println("not palindrom");
       // ispali(s);



    }
    
}
