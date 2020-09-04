import java.util.*;
public class sReduceString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)==input.charAt(i-1)){
                input = input.substring(0, i-1) + input.substring(i+1);
                i =0;
            }
        }
        System.out.println(input.length()==0?"Empty String":input);
       sc.close();
    }
}