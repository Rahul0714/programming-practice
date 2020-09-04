import java.util.*;
public class DigitsInFactorial {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
        sc.close();
    }
    static int check(int number){
        double digits = 0;
        for(int i=1;i<=number;i++){
            digits += Math.log10(i);
        }
        int ans = (int)Math.floor(digits)+1;
        return ans;
    }
}