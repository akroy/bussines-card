 import java.util.*;
 public class string {
    public static void getrevers(String s)
    {
        Stack<Character> st= new Stack<>();

        int n= s.length();
        
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
        // this while loop for the last word becaue after last word there is no space occur 
        // so we need to pritn the lst word also 
        
        while (st.empty() == false) 
            System.out.print(st.pop());

    }
    public static void main(String[] args) {

        String s= "the sun rises in the east";
        getrevers(s);


    }
    
}

 
