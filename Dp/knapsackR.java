import java.util.*;
class knapsackR{
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many choices");
        int n = sc.nextInt();
        System.out.println("Enter Weights of choices");
        int weights[] = new int[n];
        for(int i=0;i<n;i++)
            weights[i] = sc.nextInt();
        System.out.println("Enter profit(value) of each choice");
        int value[] = new int[n];
        for(int i=0;i<n;i++)
            value[i] = sc.nextInt();
        System.out.println("Enter capacity of knapsack");
        int cap = sc.nextInt();
        t = new int[n+1][cap+1];
        System.out.println("Max Profit: "+knapsack(value,weights,n,cap));
        sc.close();
    }
    static int knapsack(int value[],int weights[],int n,int cap){
        if(n==0||cap==0)
            return 0;
        if(weights[n-1]<=cap){
            return t[n][cap] = Math.max(value[n-1] + knapsack(value, weights, n-1, cap-weights[n-1]),
            knapsack(value,weights,n-1,cap));
        }
        else if(weights[n-1]>cap){
            return t[n][cap] = knapsack(value, weights, n-1, cap);
        }
        return t[n][cap];
    }
}