import java.util.*;
public class countSubsetR {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter sum");
        int sum = sc.nextInt();
        t = new int[n+1][sum+1];
        for(int j=0;j<sum+1;j++)
            t[0][j] = 0;
        for(int i=0;i<n+1;i++)
            t[i][0] = 1;
        System.out.println("Count: "+countIt(arr,sum,n));
        sc.close();
    }
    static int countIt(int arr[],int sum,int n){
        if(sum==0&&n==0)
            return 1;
        if(sum==0&&n!=0)
            return 1;
        if(sum!=0&&n==0)
            return 0;
        if(arr[n-1]<=sum){
            t[n][sum] = countIt(arr, sum-arr[n-1], n-1) + countIt(arr, sum, n-1);
        }
        else if(arr[n-1]>sum){
            t[n][sum] = countIt(arr, sum, n-1);
        }
        return t[n][sum];
    }
}