import java.util.*;
//1.1) Find the Union of the two sorted arrays.

class OneU{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[m];
            for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
            for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
            Set<Integer> arr = new HashSet<>();
            for(int temp:arr1)
            arr.add(temp);
            for(int temp:arr2){
                    arr.add(temp);
            }
            System.out.println(arr.size());
        }
        sc.close();
    }
}
