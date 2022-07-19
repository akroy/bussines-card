import java.util.*;
public class dfs {
    public static void dfs(int vertex)
    {
        boolean vis[]=
    }
    public static void main(String[] args) {
        
        // first we ceate the arraylist 
        ArrayList<Integer> g=new ArrayList<>();
        int n,m;// n no.of vertex,not edges
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();// this is no of vertex
        m=sc.nextInt();//this is no.of edges

        for(int i=0;i<m;i++)
        {
            int v1,v2;
            v1= sc.nextInt();
            v2=sc.nextInt();
            g.get(v1).add(v2);
            g.get(v2).add(v1);
        }

    }
    
}
