import java.util.*;
public class coinChange1I {
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
        for(int j=0;j<sum+1;j++)
            t[0][j] = 0;
        for(int i=0;i<n+1;i++)
            t[i][0] = 1;
        int i =0,j =0;    
        for(i=1;i<n+1;i++){
            for(j=1;j<sum+1;j++){
                if(coin[i-1]<=j){
                    t[i][j] = t[i][j-coin[i-1]] + t[i-1][j]; 
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        System.out.println(t[i-1][j-1]);
        sc.close();
    }
}