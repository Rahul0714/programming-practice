import java.util.*;

public class unbKnapsackR {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wt[] = new int[n];
        System.out.println("Enter weights");
        for(int i=0;i<n;i++)
            wt[i] = sc.nextInt();
        int val[] = new int[n];
        System.out.println("Enter profits/values");
        for(int i=0;i<n;i++)
            val[i] = sc.nextInt();
        System.out.println("Enter capacity of knapsack");
        int W = sc.nextInt();
        t = new int[n+1][W+1];
        System.out.println("Max Profit: "+uKnapsack(wt,val,n,W));
        sc.close();
    }   
    static int uKnapsack(int wt[], int val[], int n, int W){
        if(n==0||W==0)
            return 0;
        if(wt[n-1]<=W){
            t[n][W] = Math.max(val[n-1] + uKnapsack(wt, val, n, W-wt[n-1]), uKnapsack(wt, val, n-1, W));
        }
        else if(wt[n-1]>W){
            t[n][W] = uKnapsack(wt, val, n-1, W);
        }
        return t[n][W];
    }
}