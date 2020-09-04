import java.util.*;
public class countTotalDigits {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int number = sc.nextInt();
            int digits =0;
            while(number!=0){
                digits++;
                number /=10;
            }
            System.out.println(digits);
        }
        sc.close();
    }
}