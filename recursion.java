public class recursion {
    // here we want to learn the recursion 
    // so here we learn how to apply recursion in any question 
    public static int fact(int n)
    {
        if(n>1)
        return n*fact(n-1);
        else
        return 1;

    }
    public static void main(String[] args) {
        int n=5;
        // here we want to find the the factorial of given intege 
        // 5!= 5(5-1)(5-2)()
        System.out.println(fact(n));
    }
    
}
