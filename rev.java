import java.util.*;

public class rev {
    public static void getrevsstr(String s)
    {
        int n= s.length();
        Stack<Character>st= new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                char x= s.charAt(i);
                st.push(x);
            }
            else
            {
                while(st.empty()==false)
                {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(st.empty()==false)
        {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String s= "hello world";
        // we need to reverse each word of ellement 
        // in the given sentece 

        getrevsstr(s);

    }
    
}
