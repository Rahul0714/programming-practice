import java.util.*;
public class halloweenSale {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int price = sc.nextInt();
        int count =0,sum =0;
        while(sum<=price){
            if(p>=m){
            count++;
            sum = sum +p;
            p = p -d;
        }
            else{
                count++;
                sum = sum +m;
            }   
            System.out.print(sum+" ");
        }
        System.out.println(--count);
        sc.close();
    }
}