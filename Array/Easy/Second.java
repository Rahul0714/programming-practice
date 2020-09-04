
//2)Check n is present in an array of size m or not.
import java.util.*;

public class Second {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int m = sc.nextInt();
        System.out.println("Enter Element to find");
        int n = sc.nextInt();
        int arr[] = new int[m];
        System.out.println("Enter Elements of array");
        for(int i=0;i<m;i++)
        arr[i] = sc.nextInt();
        boolean check = false;
        for(int i=0;i<m;i++){
            if(arr[i]==n){
                check = true;
                break;
            }
        }
        if(check)
        System.out.println(check);
        else
        System.out.println(check);
        sc.close();
    }
}