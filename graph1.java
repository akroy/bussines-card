import java.util.ArrayList;

import java.util.*;

public class graph1 {
    ArrayList<ArrayList<Integer>> adj;
    int v;
    graph1(int v)
    {
        this.v=v;
        adj= new ArrayList<ArrayList<Integer>>(v);
         for(int i=0;i<v;i++)
          adj.add(new ArrayList<Integer>());
    }
     void addadg(int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    void printadj()
    {
        for(int i=0;i<adj.size();i++)
        {
            System.out.println("adjecendy list of"+" "+i);
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int v=5;
        graph1 g= new graph1(v);
        g.addadg(0, 1);
        g.addadg(0, 4);
        g.addadg(1, 2);
        g.addadg(1, 4);
        g.addadg(1, 3);
        g.addadg(4, 3);
        g.addadg(2,3);
        g.printadj();

        
    }
    
}
