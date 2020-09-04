import java.util.*;
//6) Find Kth largest and smallest element.
public class Sixth {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();
        System.out.println("Enter Element");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Enter Kth Element");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(k+"th largest= "+arr[n-k]);
        System.out.println(k+"th smallest= "+arr[k-1]);
        sc.close();
    }
}