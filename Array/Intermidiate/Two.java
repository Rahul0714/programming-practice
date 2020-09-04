import java.util.*;
//2) Write a program to cyclically rotate an array by one.
public class Two {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int temp=arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            for(int i:arr)
            System.out.print(i+" ");
            System.out.println();
        }
        sc.close();
    }   
}