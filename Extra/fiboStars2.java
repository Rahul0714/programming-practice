import java.util.*;
public class fiboStars2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = sc.nextInt();
        int totn = 0;
        for(int i=1;i<=n;i++)
            totn = totn + i;
        int n1 =0, n2 =1;
        arr.add(n1);
        arr.add(n2);
        for(int i=2;i<totn;i++){
            int n3 = n1 + n2;
            arr.add(n3);
            n1 = n2;
            n2 = n3;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr.remove(0)+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}