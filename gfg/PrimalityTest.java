// School Method

import java.util.*;
class PrimalityTest{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            int num = sc.nextInt();
            boolean check = checkPrime(num);
            if(check)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        sc.close();
    }
    static boolean checkPrime(int num){
        if(num<=1)
        return false;
        if(num<=3)
        return true;
        if(num%2==0 || num%3==0)
        return false;
        for(int i=5;i*i<=num;i+=6){
            if((num%i)==0 || (num%(i+2))==0)
            return false;
        }
        return true;
    }
}