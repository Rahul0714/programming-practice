
//3)Find min and max from the array.
import java.util.*;

public class Third {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int min=arr[0],max=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Min= "+min);
        sc.close();
    }    
}