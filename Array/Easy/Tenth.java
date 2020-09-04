import java.util.*;
//10) Move all negative numbers to one side.
public class Tenth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int temp,low = 0,high = n-1;
        boolean check  = true;
        while(low<=high){
            if(arr[low]<0){
                low++;
            }
            else if(arr[low]>0){
                while(arr[high]>0){
                    high--;
                    if(high<low)
                    check = false;
                }
                if(check == true){
                temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        sc.close();
    }
}