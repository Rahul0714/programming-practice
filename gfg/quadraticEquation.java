import java.util.*;
public class quadraticEquation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            long check = ((Math.round(Math.pow(b,2))) - (4*a)*c);
            System.out.println(Math.pow(b, 2));
            System.out.println(4*a*c);
            if(check<0)
            System.out.println("Imaginary");
            else{
                System.out.println(Math.round(Math.sqrt(check)));
                int root1 = 0 -(b + (int)Math.round(Math.sqrt(check)));
                int root2 = (int)Math.round(Math.sqrt(check))-b;
                root1 /= 2*a;
                root2 /= 2*a;
                
                System.out.println(root1+" "+root2);
            }
        }
        sc.close();
    }
}
//Wrong