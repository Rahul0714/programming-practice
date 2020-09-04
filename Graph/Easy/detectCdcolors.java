//detect cycle in directed graph using colors.
import java.util.*;
public class detectCdcolors {
    static int White =0,Grey =1,Black =2;
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
        for(Map.Entry<Integer,LinkedList<Integer>> entry: graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int ch:entry.getValue()){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        int color[] = new int[v];
        for(int i=0;i<v;i++)
            color[i] = White;
        for(int i=0;i<v;i++){
            if(color[i]==White){
                System.out.println(detectCycle(i,color,graph)?"isCycle":"isNotCycle");
                break;
            }
        }
        sc.close();
    }
    static boolean detectCycle(int node,int color[],Map<Integer,LinkedList<Integer>> graph){
        color[node] = Grey;
        for(int ch:graph.get(node)){
            if(color[ch]==Grey) 
                return true;
            if(color[ch]==White&&detectCycle(ch,color,graph)==true)
                return true;
        }       
        color[node] = Black;
        return false;
    }
}