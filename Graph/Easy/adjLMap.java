import java.util.*;
public class adjLMap {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int j = 0;
        Map<Integer,LinkedList<Integer>> graph = new HashMap<Integer,LinkedList<Integer>>();
        for(int i=0;i<v;i++)
            graph.put(i, new LinkedList<Integer>());
        for(int i=0;i<v;i++){
            System.out.println("How many elements connected to "+i);
            int vcn = sc.nextInt();
            for(int k=0;k<vcn;k++){
                System.out.println("Enter node");
                graph.get(j).add(sc.nextInt());
            }
            j++;
        }
        for(Map.Entry<Integer, LinkedList<Integer>> entry:graph.entrySet()){
            System.out.print(entry.getKey()+"-> ");
            for(int node:entry.getValue()){
                System.out.print(node+", ");
            }
            System.out.println();
        }
        sc.close();
    }
}