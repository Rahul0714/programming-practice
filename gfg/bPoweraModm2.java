
// b is a very large number

import java.util.*;
public class bPoweraModm2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            int num1 = sc.nextInt();
            String num2 = sc.next();
            int mod = sc.nextInt();
            int ans = getNumber(num2,mod);
            int mul = ans;
            for(int i=1;i<num1;i++){
                ans = (ans*mul) % mod;
            }
            System.out.println(ans);
        }
        sc.close();
    }
    static int getNumber(String num2,int mod){
        int number = 0;
        for(int i=0;i<num2.length();i++){
            number *= 10;
            int x = Character.getNumericValue(num2.charAt(i));
            number += x;
            number %= mod;
        }
        return number;
    }
}