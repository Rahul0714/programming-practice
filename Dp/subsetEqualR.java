import java.util.*;

public class subsetEqualR {
    static boolean t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter sum");
        int sum = sc.nextInt();
        t = new boolean[n+1][sum+1];
        for(int j=0;j<sum+1;j++)
            t[0][j] = false;
        for(int i=0;i<n+1;i++)
            t[i][0] = true;
        System.out.println(subsetCheck(arr,n,sum));
        sc.close();
    }
    static boolean subsetCheck(int arr[],int n,int sum){
        if(n==0&&sum==0)
            return true;
        if(n==0&&sum!=0)
            return false;
        if(n!=0&&sum==0)
            return true;
        if(arr[n-1]<=sum){
            return t[n][sum] = subsetCheck(arr,n-1,sum-arr[n-1])||subsetCheck(arr,n-1,sum);
        }
        else if(arr[n-1]>sum)
            return t[n][sum] = subsetCheck(arr, n-1, sum);
        return t[n][sum];
    }
   
}