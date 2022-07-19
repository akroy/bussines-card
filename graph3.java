import java.util.*;
public class graph3 {
    // here we wrtie the code for the viewing the adjcency list of the graph so 
    // lets start the coding bro
    // actully there are two way to wrtie code one is withoutn using any calass
    ArrayList<ArrayList<Integer>>adj;
    int v;
    graph3(int v)
    {
        this.v=v;
        adj= new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
    }
    void addedg(int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void printadjc()    // this function print the adjecency list of given graph
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("adjecency list of graph"+" "+i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        graph3 g= new graph3(5);// here i call the graph3 class to make the graph it create
                                // a graph of 5 vertex
        // nwo it s time to add edges ;
        // here we add adges manually
        g.addedg(0, 1);
        g.addedg(0, 4);
        g.addedg(1, 4);
        g.addedg(1, 3);
        g.addedg(4, 3);
        g.addedg(2, 3);
        g.addedg(2, 1);
        g.printadjc();// this class print the adjecency list 
    }
    
}
