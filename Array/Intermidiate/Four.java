/*import java.util.*;
//4) Find all pairs on integer array whose sum is equal to given number.
public class Four {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            int count = 0;
            for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
            if(arr[i]+arr[j]==k)
            count++;
            System.out.println(count);
        }
        sc.close();
    }
} O(n^2)
*/

/*
import java.util.*;

class Four{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arrayList.add(arr[i]);
            }
            int sum =0,count =0;
            for(int i=0;i<n;i++){
                sum = x -arr[i];
                if(arrayList.contains(sum)){
                    count++;
                }
                if(sum ==arr[i])
                count--;
            }
            System.out.print(count/2);
        }
        sc.close();
    }
} O(n) but every element should be different.
*/
import java.util.*;

class Four{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++)
            arr[j] = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int x=0;x<n;x++){
                if(!map.containsKey(arr[x]))
                map.put(arr[x],0);
            map.put(arr[x],map.get(arr[x])+1);
            }
            for(int ch:arr)
            System.out.print(map.get(ch));
            System.out.println();
            int count =0;
            for(int ii=0;ii<n;ii++){
                if(map.get(k-arr[ii])!=null){
                    count +=map.get(k-arr[ii]);
                }
                if(k-arr[ii]==arr[ii])
                count--;
                System.out.println("After "+ii+"th ="+count);
            }
            System.out.println(count/2);
            System.out.println(map.get(2));
        }
        sc.close();
    }
}