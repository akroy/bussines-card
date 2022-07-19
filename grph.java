import java.util.*;
// here i first write the code for the find and print the adjcency lsit of graph
// then after modification i converted it into dfs traversal
// so lets start

public class grph {
    //ArrayList<ArrayList<Integer>> adj;
    private LinkedList<Integer> adj[];
    private int V;
    grph(int v) // this is for constructor 
    {
        V=v;
        //adj= new ArrayList<ArrayList<Integer>>(v);
        adj= new LinkedList[v];
        for(int i=0;i<v;i++)
        {
          //adj.add(new ArrayList<Integer>());
          adj[i]=new LinkedList();
        }
    }
    void addedgee(int u,int v)
    {
        //adj.get(u).add(v);// this is for undirected graph 
        //adj.get(v).add(u);// this also for undirected graph 
        adj[u].add(v);
    }
    // this is dfs function which performe the depth search search
    //it take the vertex from where we want to perfome the dfs operation
    // and one more thing it uses recursive dfsutil
    void dfsutil(int v,boolean visi[])
    {
        // mark first element as visited and print it
        visi[v]=true;
        System.out.print(v+" ");

        Iterator<Integer>i= adj[v].listIterator();
        while(i.hasNext())
        {
            int n=i.next();
            if(!visi[n])
            dfsutil(n, visi);
        }
    }
    void dfs()
    {
        // first we have to mark all vertex as not 
        // visitied so java mark all vertex as false
        boolean visited[]=new boolean[V];
        // call the recursive function to print dfs treversal
        for(int i=0;i<V;i++)
        if(visited[i]==false)
           dfsutil(i,visited);

    }


    public static void main(String[] args) {
        //int v=5;
        grph g= new grph(4);
        g.addedgee(0, 1);
        g.addedgee(0, 2);
        g.addedgee(2,0);
        g.addedgee(2, 3);
       
        g.addedgee(1,2);
        g.addedgee(3,3);
        System.out.println("folowing are the dfs from node no 2");
        g.dfs(5);
    }
    
}
