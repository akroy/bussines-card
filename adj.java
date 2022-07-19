import java.util.*;

public class adj {
    public static void addedge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }
    public static void pirntadj(ArrayList<ArrayList<Integer>>adj)
    {
        for(int i=0;i<adj.size();i++){
            System.out.println("adlist of"+" "+i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int v=5;// this is for creating graph for 5 vertex
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        // adding edges one by one
        addedge(adj,0,1);
        addedge(adj,0,4);
        addedge(adj,1,4);
        addedge(adj,1,3);
        addedge(adj,1,4);
        addedge(adj,2,3);
        addedge(adj,3,4);
        pirntadj(adj);

        

        


    }
}
