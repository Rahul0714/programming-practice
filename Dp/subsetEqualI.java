import java.util.*;
public class subsetEqualI {
    static boolean t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter sum amount");
        int sum = sc.nextInt();
        t = new boolean [n+1][sum+1];
        for(int j=0;j<sum+1;j++)
            t[0][j] = false;
        for(int i=0;i<n+1;i++)
            t[i][0] = true;
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
        System.out.println("is it possible: "+t[i-1][j-1]);
        sc.close();
    }
}