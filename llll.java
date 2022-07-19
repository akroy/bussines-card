import java.util.ArrayList;
import java.util.LinkedList;

public class llll {

   public static boolean chekpali( LinkedList<Integer>li)
   {
    
    int n= li.size();
    for(int i=0;i<n;i++)
    {
        if(li.get(i)!=li.get(n-1-i))
        {
            return false;
        }
        

    }
    return true;


   }

    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(1);
        l.add(1);
        if(chekpali(l))
        System.out.print("palindrom");
        else
        System.out.print("not palindrom");
        
    }
}
