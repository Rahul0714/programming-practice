import java.util.*;

//1.2) Find the Intersection of the two sorted arrays.
public class OneI {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Set<Integer> arr1 = new HashSet<>();
            Set<Integer> arr2 = new HashSet<>();
            for(int k=0;k<n;k++)
            arr1.add(sc.nextInt());
            for(int k=0;k<m;k++)
            arr2.add(sc.nextInt());
            arr1.retainAll(arr2);
            System.out.println(arr1.size());
        }
        sc.close();
    }
}