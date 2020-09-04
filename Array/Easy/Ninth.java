import java.util.*;
//9) Find Range difference of max and min of an array.
public class Ninth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int max = arr[0],min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max)
            max = arr[i];
            if(arr[i]<min)
            min = arr[i];
        }
        int range = max - min;
        System.out.println("Range= "+range);
        sc.close();
    }   
}