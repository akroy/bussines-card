import java.util.Stack;

public class reverseech {
    public static void rever(String s)
    {
        int n= s.length();
        Stack<Character>st= new Stack<>();

        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)!=' ')
           {
               st.push(s.charAt(i));

           }
           else
           {
               while(st.isEmpty()==false)
               {
                System.out.print(st.pop());
               }
               //st.pop();
           }
           System.out.print(" ");

        }
        while(st.isEmpty()==false)
        {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String s="hello world";
        rever(s);
    }
    
}
