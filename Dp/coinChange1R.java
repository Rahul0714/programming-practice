import java.util.*;
public class coinChange1R {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coin[] = new int[n];
        for(int i=0;i<n;i++)
            coin[i] = sc.nextInt();
        System.out.println("Enter sum");
        int sum = sc.nextInt();
        t = new int[n+1][sum+1];
        System.out.println("Count: "+countIt(coin,sum,n));
        sc.close();
    }
    static int countIt(int coin[], int sum, int n){
        if(sum==0&&n==0){
            return 1;
        }
        if(sum==0&&n!=0){
            return 1;
        }
        if(sum!=0&&n==0){
            return 0;
        }
        if(coin[n-1]<=sum){
            t[n][sum] = countIt(coin, sum-coin[n-1], n) + countIt(coin, sum, n-1);
        }
        else if(coin[n-1]>sum){
            t[n][sum] = countIt(coin, sum, n-1);
        }
        return t[n][sum];
    }
}