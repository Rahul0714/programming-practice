import java.util.*;
public class unbKnapsackI {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter wight");
        int wt[] = new int[n];
        for(int i=0;i<n;i++)
            wt[i] = sc.nextInt();
        System.out.println("Enter values/profits");
        int val[] = new int[n];
        for(int i=0;i<n;i++)
            val[i] = sc.nextInt();
        System.out.println("Enter capacity of knapsack");
        int W = sc.nextInt();
        t = new int[n+1][W+1];
        for(int i=0;i<n+1;i++)
            for(int j=0;j<W+1;j++)
                if(i==0||j==0)
                    t[i][j] = 0;
        int i =0,j =0;
        for(i=1;i<n+1;i++){
            for(j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(val[i-1] + t[i][j-wt[i-1]], t[i-1][j]); 
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println(t[i-1][j-1]);
        sc.close();
    }
}