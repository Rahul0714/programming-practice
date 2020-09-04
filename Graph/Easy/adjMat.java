import java.util.*;
public class adjMat{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int graph[][] = new int[v][v];
        char ch = 'y';
        System.out.println("Is Directed Graph(true/false)");
        boolean isDirected = sc.nextBoolean();
        while(ch!='n'){
            System.out.println("source and dest vetrex (0 to "+(v-1)+")");
            int u1 = sc.nextInt();
            int u2 = sc.nextInt();
            System.out.println("Enter weight");
            if(isDirected)
                graph[u1][u2] = sc.nextInt();
            else{
                graph[u1][u2] = sc.nextInt();
                graph[u2][u1] = graph[u1][u2];
            }
            System.out.println("Want to add another edge");
            ch = sc.next().charAt(0);
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
