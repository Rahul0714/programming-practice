import java.util.*;
public class printWithoutLoop {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int n = sc.nextInt();
            printNumber(n);
        }
        sc.close();
    }
    static void printNumber(int n){
        if(n>0){
            printNumber(n-1);
            System.out.print(n+" ");
        }
        return;
    }
}