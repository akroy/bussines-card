import java.util.*;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> v= new ArrayList<>();
        v.add(90);
        v.add(9);
        v.add(95);
        v.add(55);
        v.add(4);

        Collections.sort(v);
        System.out.println(v);


    }
    
}
