import java.util.*;

public class adj2 {
    // here we write the code for the print the adjecency list for the graph 
    // for this i create the array list and implement the 
    // arraylist method 
    public static void addedge(ArrayList<ArrayList<Integer>>adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    // here we write the code for the prit the adjcency lsit
    public static void printadj(ArrayList<ArrayList<Integer>>adj)
    {
        for(int i=0;i<adj.size();i++)
        {
           System.out.println("adjcency list of"+" "+i);
           for(int j=0;j<adj.get(i).size();j++)
           {
               System.out.print(adj.get(i).get(j)+" ");
           }
           System.out.println();

        }
    }
    public static void main(String[] args) {
        int v=5;//in the varible v we store the no vertex in the graph
        // before doign this i drow the graph on my copy and designe the graph 
        // now it s time to demonstrate the same tree 
        // basically we do hwo t o implement the cod efor the graph
        ArrayList<ArrayList<Integer>>adj= new ArrayList<>();// this is list of list 
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer> ());
        }
        // now we add edge one by one 
        addedge(adj,0,1);
        addedge(adj,0,4);
        addedge(adj,1,3);
        addedge(adj,1,4);
        addedge(adj,1,2);
        addedge(adj,2,3);
        addedge(adj,3,4);
        // now it s time to print the adjacency list 
        // like which node are connected to another nod e
        printadj(adj);
        



        
    }
    
}
