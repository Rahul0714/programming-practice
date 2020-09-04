import java.util.*;
//7) Find number of occurence of m in n sized array.
public class Seventh {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        int count = 0;
        System.out.println("Enter Number to find Occurences");
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==m)
            count++;
        }
        System.out.println("Occurence of "+m+" in array is "+count);
        sc.close();
    }
}