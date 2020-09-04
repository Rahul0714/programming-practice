import java.math.BigInteger;
import java.util.*;

//14) Find the factorial of a large number.
public class Fourteen {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            BigInteger fact = new BigInteger("1");
            for(int i=1;i<=n;i++){
                fact = fact.multiply(BigInteger.valueOf(i));
            }          
            System.out.println(fact);  
        }
        sc.close();
    }    
}