import java.util.*;

public class adjcencylist {
    public static void addedge(ArrayList<ArrayList<Integer>>adj,int u,int v)
    {
        adj.get(u).add(v);
        //adj.get(v).add(u);
    }
    public static void printadj(ArrayList<ArrayList<Integer>>adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("adlist of "+" "+i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());

        }
        // here we add edges one by one
        addedge(adj,2,1);
        addedge(adj,2,3);
        addedge(adj,4,1);
        addedge(adj,5,4);
        addedge(adj,5,1);
        addedge(adj,6,2);
        addedge(adj,0,2);
        printadj(adj);

    }
    
}
