import java.util.*;
public class evenPartR {
    static boolean t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum =0;
        for(int ch:arr)
            sum = sum +ch;
        if(sum%2!=0){
            System.out.println("Can't divide");
        }
        else{
            sum = sum /2;
            t = new boolean[n+1][sum+1];
            for(int j=0;j<sum+1;j++)
                t[0][j] = false;
            for(int i=0;i<n+1;i++)
                t[i][0] = true;
            System.out.println(canDivide(arr,n,sum)?"Can divide":"Can't divide");
        }
        sc.close();
    }
    static boolean canDivide(int arr[], int n, int sum){
        if(n==0&&sum==0)
            return true;
        if(n==0&&sum!=0)
            return false;
        if(n!=0&&sum==0)
            return true;
        if(arr[n-1]<=sum){
            t[n][sum] = canDivide(arr, n-1, sum-arr[n-1]) || canDivide(arr, n-1, sum);
        }
        else if(arr[n-1]>sum){
            t[n][sum] = canDivide(arr, n-1, sum);
        }
        return t[n][sum];
    }
}