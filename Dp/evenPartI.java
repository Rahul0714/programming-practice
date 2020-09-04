import java.util.*;
public class evenPartI {
    static boolean t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum  = 0;
        for(int i=0;i<n;i++)
            sum = sum + arr[i];
        if(sum%2!=0)
            System.out.println("Can't divide");
        else{
            sum = sum/2;
            t = new boolean[n+1][sum+1];
            for(int j=0;j<sum+1;j++)
                t[0][j] = false;
            for(int i=0;i<n+1;i++)
                t[i][0] = true;
            System.out.println(canDivide(arr,n,sum/2)?"Can divide":"Can't divide");
        }
        sc.close();
    }
    static boolean canDivide(int arr[],int n,int sum){
        int i =0,j =0;
        for(i=1;i<n+1;i++){
            for(j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[i-1][j-1];
    }
}