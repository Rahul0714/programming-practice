
// a is a very large number

import java.util.*;
public class aPowerbModm1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            String num1 = sc.next();
            int num2 = sc.nextInt();
            int mod = sc.nextInt();
            int ans = getNumber(num1,mod);
            int mul = ans;
            for(int i=1;i<num2;i++){
                ans = (ans*mul) % mod;
            }
            System.out.println(ans);
        }
        sc.close();
    }
    static int getNumber(String num1, int mod){
        int number = 0;
        for(int i=0;i<num1.length();i++){
            number *= 10;
            int x = Character.getNumericValue(num1.charAt(i));
            number += x;
            number %= mod;
        }
        return number;
    }
}