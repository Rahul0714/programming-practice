import java.util.*;
public class modularMultiplicativeInverse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int a = sc.nextInt();
            int m = sc.nextInt();
            a = a %m;
            for(int i=1;i<m;i++){
                if(((a*i)%m)==1){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}

