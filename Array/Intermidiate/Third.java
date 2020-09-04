import java.util.*;

//3) You are given a list of n-1 integers and these integers are in the range of 1 to n. 
//   There are no duplicates in the list. One of the integers is missing in the list. 
//   Write an efficient code to find the missing integer.
class Third{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum1 =0,sum2 =0;
            for(int i=0;i<n-1;i++)
            arr[i] = sc.nextInt();
            for(int i=0;i<n-1;i++)
            sum1+=arr[i];
            for(int i=0;i<=n;i++)
            sum2+=i;
            System.out.println(sum2-sum1);
        }
        sc.close();
    }
}