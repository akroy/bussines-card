import java.util.*;
public class Graph {
// here we do bfs on graph 
// bfs breth first search algorithm 
// it nothing but it is a method to travrese all element in graph
private static ArrayList getAdjList(){
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    adjList.add(list1);


    ArrayList<Integer> list2 = new ArrayList<Integer>();
    adjList.add(list2);

    ArrayList<Integer> list3 = new ArrayList<Integer>();
    list3.add(1);
    adjList.add(list3);

    ArrayList<Integer> list4 = new ArrayList<Integer>();
    list4.add(2);
    list4.add(4);
    adjList.add(list4);

    ArrayList<Integer> list5 = new ArrayList<Integer>();
    adjList.add(list5);

    return adjList;
}
private static void performBFS(ArrayList<ArrayList<Integer>> adjList){
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(0);

    boolean[] visited = new boolean[adjList.size()];

    while(!queue.isEmpty()){
        Integer vertex = queue.remove();

        System.out.print(vertex + " ");
        visited[vertex] = true;

        ArrayList<Integer> newVertexReachable = adjList.get(vertex);
        
        if(!newVertexReachable.isEmpty()){
            for(Integer newVertex : newVertexReachable){
                if(!visited[newVertex]){
                    queue.add(newVertex);
                }
            }
        }
    }
}   


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = getAdjList();
        performBFS(adjList);
        
    }
    
}
