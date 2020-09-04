import java.util.*;
public class sumOfDigitsOfNumber {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int n = sc.nextInt();
            int sum =0;
            while(n!=0){
                sum +=(n%10);
                n /=10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}