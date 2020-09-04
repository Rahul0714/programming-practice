import java.util.*;
public class iceCreamchef {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int chefBalance =0;
            boolean check = true;
            int noOfCustomer = sc.nextInt();
            int arr[] = new int[noOfCustomer];
            for(int k=0;k<noOfCustomer;k++)
                arr[k] = sc.nextInt();
            for(int ch:arr){
                if(ch-5 <= chefBalance){
                    if(ch==5)
                    chefBalance += ch;
                    else
                    chefBalance += (ch-5);
                }
                else{
                    System.out.println("NO");
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
        }
        sc.close();
    }
}