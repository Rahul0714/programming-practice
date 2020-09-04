import java.util.*;
//10) Given an array with all distinct elements, find the largest three elements. 
//    Expected time complexity is O(n) and extra space is O(1).
public class Ten {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int max1 =0,max2 =0,max3 =0;
        for(int i=0;i<n;i++){
            if(arr[i]>max1)
            max1 =arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max2&&arr[i]<max1)
            max2 =arr[i];
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max3&&arr[i]<max2)
            max3 =arr[i];
        }
        System.out.println(max1+" "+max2+" "+max3);
        sc.close();
    }   
}