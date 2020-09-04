//4)Reverse the array.
import java.util.*;

public class Fourth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int temp,n = sc.nextInt();
        System.out.println("Enter Elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        for(int i=0,j=n-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }    
}