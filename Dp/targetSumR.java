import java.util.*;
public class targetSumR {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter sum");
        int diff = sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++)
            sum = sum + arr[i];
        int s1 = (sum+diff)/2;
        t = new int[n+1][s1+1];
        System.out.println("Count: "+countIt(arr,s1,n));
        sc.close();
    }
    static int countIt(int arr[], int s1, int n){
        if(n==0&&s1==0)
            return 1;
        if(n==0&&s1!=0)
            return 0;
        if(n!=0&&s1==0)
            return 1;
        if(arr[n-1]<=s1){
            t[n][s1] = countIt(arr, s1-arr[n-1], n-1) + countIt(arr, s1, n-1);
        }
        else if(arr[n-1]>s1){
            t[n][s1] = countIt(arr, s1, n-1);
        }
        return t[n][s1];
    }
}