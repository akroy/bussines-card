public class test5 {
    public static String common(String a,String b)
    {
        String sol="";
        for(int i=0;i<Math.min(a.length(),b.length());i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                sol+=a.charAt(i);
            }
            else
            {
                break;
            }
        } 
    return sol;
    }
    public static String longestcommon(String arr[],int n)
    {

        String ans= arr[0];
        for(int i=1;i<n;i++)
        {
            ans= common(ans,arr[i]);
        }
        if(ans.isEmpty())
         return "-1";

     return ans;
    }
    public static void main(String[] args) {
       
       String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"};
       int n=4;
       String res= longestcommon(arr,n);
       System.out.print(res);
    }
    
}
