//detect cycle in directed graph using dfs.
import java.util.*;
public class detectCddfs {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<v;i++)
            graph.put(i, new LinkedList<Integer>());
        for(int i=0,k=0;i<v;i++,k++){
            System.out.println("how many elements connected to "+i);
            int vcn = sc.nextInt();
            for(int j=0;j<vcn;j++){
                System.out.println("Enter node");
                graph.get(k).add(sc.nextInt());
            }
        }
        for(Map.Entry<Integer,LinkedList<Integer>> entry: graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int ch:entry.getValue()){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        boolean recStack[] = new boolean[v];
        boolean visited[] = new boolean[v];
        System.out.println("Enter start node");
        int node = sc.nextInt();
        System.out.println(detectCycle(node,visited,recStack,graph)?"isCyclic":"isNotCyclic");
        sc.close();
    }
    static boolean detectCycle(int node,boolean visited[],boolean recStack[],Map<Integer,LinkedList<Integer>> graph){
        if(recStack[node])
            return true;
        if(visited[node])
            return true;
        visited[node] = true;
        recStack[node] = true;
        for(int ch:graph.get(node))
            if(detectCycle(ch, visited, recStack, graph))
                return true;
        recStack[node] = false;
        return false;
    }
}