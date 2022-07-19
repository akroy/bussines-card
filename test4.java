import java.util.ArrayList;

public class test4 {
    public static void printno(String si)
    {
        String s[]= si.split("");

        int  a[]= new int[si.length()];

        //ArrayList<Character> v= new ArrayList<>();
       // int b[]= new int[n];

        for(int i=0;i<si.length();i++)
        {
         a[i]=Integer.parseInt(s[i]);
        }
        if(si.length()==1)
        {
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String s= "230";

        printno(s);

        
    }
    
}
