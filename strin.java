import java.util.*;

public class strin {

    //The sun rises in the east

    //eht nus sesir ni eht tsae 
    public static void reversest(String s)
    {
        int n= s.length();
        //String ans="";
        Stack<Character>st= new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                st.push(i);
            }
            else
            {
                while (st.empty()==false ){
                    System.out.println(st.pop());
                    
                }System.out.println(" ");
            }
            
        }
        while(st.empty()==false)
        {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String s="The sun rises in the east";
        reversest(s);

    }
    
}
