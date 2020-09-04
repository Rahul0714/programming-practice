import java.util.*;
public class dfs {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int k =0;
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<v;i++)
            graph.put(i, new LinkedList<Integer>());
        for(int i=0;i<v;i++){
            System.out.println("How many nodes connected to "+i);
            int vcn = sc.nextInt();
            for(int j=0;j<vcn;j++){
                System.out.println("Enter node");
                graph.get(k).add(sc.nextInt());
            }
            k++;
        }
        for(Map.Entry<Integer,LinkedList<Integer>> entry:graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int ch:entry.getValue()){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        boolean visited[] = new boolean[v];
        System.out.println("Enter starting node");
        int node = sc.nextInt();
        dfsFind(node,visited,graph);
        sc.close();
    }
    static void dfsFind(int node,boolean visited[],Map<Integer,LinkedList<Integer>> graph){
        // for(boolean t:visited)
        //     System.out.print(t+" ");
        visited[node] = true;
        System.out.print(node+" ");
        Iterator<Integer> iter = graph.get(node).listIterator();
        while(iter.hasNext()){
            int newNode = iter.next();
            if(!visited[newNode])
                dfsFind(newNode,visited,graph);
        }
    }
}