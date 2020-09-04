import java.util.*;
public class coinChange2I {
    static int t[][];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coin[] = new int[n];
        for(int i=0;i<n;i++)
            coin[i] = sc.nextInt();
        System.out.println("Enter Amount");
        int amt = sc.nextInt();
        t = new int[n+1][amt+1];
        for(int i=0;i<n+1;i++)
            t[i][0] = 0;
        for(int j=0;j<amt+1;j++)
            t[0][j] = Integer.MAX_VALUE -1;
        // for(int j=0;j<amt+1;j++){
        //     if(t[1][j]%coin[0]==0){
        //         t[1][j] = t[1][j]/coin[0];
        //     }
        //     else
        //         t[1][j] = Integer.MAX_VALUE-1;
        // }
        int i =0,j =0;    
        for(i=1;i<n+1;i++){
            for(j=1;j<amt+1;j++){
                if(coin[i-1]<=j){
                    t[i][j] = Math.min(t[i][j-coin[i-1]]+1, t[i-1][j]);
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