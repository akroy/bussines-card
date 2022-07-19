import java.util.*;
public class valid {
    // here we want to write the code for find the given string is valid paranthis or not

    // here we have to given that string s= "[{()}]";
    //here we have to given tha s and we need to find wether the given s is valid or not 
   

    public static boolean isvalid( String s )
    {
       
     Deque<Character> st = new ArrayDeque<>();

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
        check = st.pop();
        if(check=='{'||check=='[')
        return false;
        break;
        case '}':
        check = st.pop();
        if(check=='('||check=='[')
        return false;
        break;
        case ']':
        check = st.pop();
        if(check=='{'||check=='(')
        return false;
        break;


        }
        
      }
      return (st.isEmpty());
    }

    public static void main(String[] args) {
        String s= "[{()}";
        // frome this question we have to learn the how we will use the statk in the future;
        if( isvalid(s))
        {
            System.out.println("given string is balanced");
        }
        else
        {
            System.out.println(" not balanced");
        }
        
    }
    
}
