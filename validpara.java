import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;



public class validpara {
    public static boolean isvalid(String s)
    {
       Deque<Character>st= new ArrayDeque<>();
       

        for(int i=0;i<s.length();i++)
        {
            char x= s.charAt(i);
            if(x=='('||x=='{'||x=='[')
            {
                st.push(x);
                continue;
            }
            if(st.isEmpty())
             return false;

             char check;
             switch(x){
                 case ')':
                 check=st.pop();
                 if(check=='{'||check=='[')
                 return false;
                 break;
                 case '}':
                 check=st.pop();
                 if(check=='('||check=='[')
                 return false;
                 break;
                 case ']':
                 check=st.pop();
                 if(check=='{'||check=='(')
                 return false;
                 break;
             }
        }
        return (st.isEmpty());
    }
    public static void main(String[] args) {
        String s="[{()}]";
        if(isvalid(s))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
    
}
