import java.util.*
;
public class jjj {
    // here we write the code for the find the unquie element in array 
    // basicallly i print the unique element in array
    public static void main(String[] args) {
        ArrayList<Integer>v= new ArrayList<>();// this is vector like data structure in java

        HashSet<Integer> st= new HashSet<>();// and this is set in java and this is how to 
        // create set in java.


    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int n= sc.nextInt();
    System.out.println("enter"+n+"element ");

    for(int i=0;i<n;i++)
    {
        int x=sc.nextInt();
        v.add(x);
        
    }
    System.out.print("elements are  "+v+" ");
    
    for(int i=0;i<v.size();i++)
    {
        st.add(v.get(i));
    }
    System.out.println(st+" ");





    }

    
}
