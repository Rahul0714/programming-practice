/*
import java.util.*;
public class exactlyThreeDivisors {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            int num = sc.nextInt();
            int count =0;
            for(int i=1;i<=num;i++){
                if(checkDivisors(i))
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
    static boolean checkDivisors(int num){
        int divisors =0;
        for(int k=1;k<=num;k++){
            if(num%k==0)
            divisors++;
        }
        if(divisors==3)
            return true;
        return false;
    }
}
TLE
*/
/*
import java.util.*;
class exactlyThreeDivisors{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int q=0;q<size;q++){
            int n = sc.nextInt();
            int count =0;
            for(int i=1;i<=n;i++){
                boolean check = checkPrime(i);
                int square = i*i;
                if(check && square<=n){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
    static boolean checkPrime(int number){
        if(number<=1) return false;
        if(number<=3) return true;
        if(number%2==0 || number%3==0) return false;
        for(int i=5;i*i<=number;i+=6){
            if((number%i)==0 || (number%(i+2))==0)
            return false;
        }
        return true;
    }
}
TLE again
*/

import java.util.*;

class exactlyThreeDivisors{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            int num = sc.nextInt();
            boolean arr[]  =new boolean[((int)Math.sqrt(num))+1];
            Arrays.fill(arr, true);
            arr[0] = arr[1] = false;
            for(int i=2;i<=(int)Math.sqrt(num);i++){
                if(arr[i] == true){
                    for(int k=i*2;k<=(int)Math.sqrt(num);k=k+i){
                        arr[k] = false;
                    }
                }
            }
            int count =0;
            for(int i=0;i*i<=num;i++){
                if(arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}