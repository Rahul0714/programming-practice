import java.util.*;
public class minSubSumDiff {
    static boolean t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++)
            sum = sum + arr[i];
        t = new boolean[n+1][sum+1];
        for(int j=0;j<sum+1;j++)
            t[0][j] = false;
        for(int i=0;i<n+1;i++)
            t[i][0] = true;
        int i =0, j =0; 
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
        ArrayList<Integer> temp = new ArrayList<Integer>();  
        for(j=0;j<Math.ceil((float)(sum+1)/2);j++){
            if(t[n][j])
                temp.add(j);
        }
        int min = Integer.MAX_VALUE;
        for(int ch:temp){
            min = Math.min(min, (sum-(2*ch)));
        }
        System.out.println(min);
        sc.close();
    }
}