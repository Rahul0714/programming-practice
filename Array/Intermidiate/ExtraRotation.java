import java.util.*;
//Extra: Both Right and Left Rotation number of rotations also inputted.
public class ExtraRotation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Enter Left Rotation");
        int left = sc.nextInt();
        System.out.println("Enter Right Rotation");
        int right = sc.nextInt();
        int temp = 0;
        for(int k=0;k<left;k++){
            temp = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
        }
        for(int k=0;k<right;k++){
            temp = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        for(int ch:arr)
        System.out.print(ch+" ");
        sc.close();
    }
}