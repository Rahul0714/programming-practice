import java.util.*;
public class adjList {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int k =0;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++)
            graph.add(new ArrayList<Integer>());
        for(int i=0;i<v;i++){
            System.out.println("How many nodes connected to "+i+"th node");
            int vcn = sc.nextInt();
            for(int j=0;j<vcn;j++){
                System.out.println("Enter node");
                graph.get(k).add(sc.nextInt());
            }
            k++;
        }
        for(int i=0;i<v;i++){
            System.out.print(i+"-> ");
            for(int ch:graph.get(i)){
                System.out.print(ch+", ");
            }
            System.out.println();
        }
        sc.close();
    }
}