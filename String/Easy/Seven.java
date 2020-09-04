//7) How do you convert string to integer and integer to string in java?
import java.util.*;
public class Seven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = Integer.parseInt(str);
        System.out.println(num);
        str = String.valueOf(num);
        System.out.println(str);
        sc.close();
    }
}