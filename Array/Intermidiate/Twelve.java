import java.util.*;

//12) Find if there is any subarray with sum equal to zero.
public class Twelve {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int k=0;k<n;k++)
            arr[k] = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            int preSum =0;
            boolean check =false;
            for(int k=0;k<n;k++){
                preSum +=arr[k];
                if(arr[k]==0||set.contains(preSum)||preSum==0){
                    System.out.println("Yes");
                    check =true;
                    break;
                }
                set.add(preSum);
            }
            if(!check)
            System.out.println("No");
        }
        sc.close();
    }    
}