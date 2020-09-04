import java.util.*;

//9) Find the first non-repeating element in a given array of integers. 
public class Nine {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                if(!map.containsKey(arr[i]))
                    map.put(arr[i],0);
                map.put(arr[i],map.get(arr[i])+1);
            }
            for(int i=0;i<n;i++){
                if(map.get(arr[i])==1){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }    
}