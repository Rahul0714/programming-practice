import java.util.*;

public class bfs {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int k =0;
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<v;i++)
            graph.put(i, new LinkedList<Integer>());
        for(int i=0;i<v;i++){
            System.out.println("How Many Connected To "+i);
            int vcn = sc.nextInt();
            for(int j=0;j<vcn;j++){
                graph.get(k).add(sc.nextInt());
            }
            k++;
        }
        for(Map.Entry<Integer,LinkedList<Integer>> entry: graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int ch:entry.getValue()){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        System.out.println("Enter Start node");
        int startNode = sc.nextInt();
        bfsFind(graph,startNode);
        sc.close();
    }
    static void bfsFind(Map<Integer,LinkedList<Integer>> graph,int startNode){
        boolean visited[] = new boolean[graph.size()];
        Arrays.fill(visited, false);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(startNode);
        visited[startNode] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node+" ");
            Iterator<Integer> iter = graph.get(node).listIterator();
            while(iter.hasNext()){
                int newNode = iter.next();
                if(!visited[newNode]){
                    queue.add(newNode);
                    visited[newNode] = true;
                }
            }
        }
    }
}