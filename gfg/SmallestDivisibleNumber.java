import java.util.*;

public class SmallestDivisibleNumber{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int q=0;q<n;q++){
            int size = sc.nextInt();
            long ans = 0;
            long temp = 1;
            for(int i=1;i<=size;i++){
                ans = (temp * i)/gcd(i,temp);
                temp = ans;
            }
            System.out.println(ans);
        } 
        sc.close();
    }
    static long gcd(long a, long b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    } 
}