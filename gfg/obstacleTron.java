import java.util.*;
public class obstacleTron {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String board[][] = new String[15][15];
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                if(i==0 || j==0 || i==14 || j==14 || j==7)
                board[i][j] = Character.toString('#');
                else
                board[i][j] = Character.toString('_');
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        } 
        sc.close();
    }
}