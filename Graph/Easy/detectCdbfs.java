//detect cycle in directed graph using bfs.
import java.util.*;
class detectCdbfs{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<v;i++)
            graph.put(i, new LinkedList<Integer>());
        for(int i=0,k=0;i<v;i++,k++){
            System.out.println("how many nodes connected to "+i);
            int vcn = sc.nextInt();
            for(int j=0;j<vcn;j++){
                System.out.println("Enter node");
                graph.get(k).add(sc.nextInt());
            }
        }
        for(Map.Entry<Integer,LinkedList<Integer>> entry:graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int ch:entry.getValue()){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        int inDegree[] = new int[v];
        Arrays.fill(inDegree, 0);
        for(int i=0;i<v;i++){
            for(int ch:graph.get(i)){
                inDegree[ch]++;
            }
        }
        System.out.println(detectCycle(v,inDegree,graph)?"isCycle":"isNotCycle");
        sc.close();
    }
    static boolean detectCycle(int v,int inDegree[],Map<Integer,LinkedList<Integer>> graph){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<v;i++)
            if(inDegree[i]==0)
                queue.add(i);
        int count =0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(queue.isEmpty()){
            int node = queue.poll();
            arr.add(node);
            for(int ch:graph.get(node)){
                if(--inDegree[ch]==0)
                    queue.add(ch);
            }
            count++;
        }
        if(count!=v)
            return true;
        else
            return false;
    }
}