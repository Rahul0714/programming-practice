import java.util.*;
public class anshArray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Elements...");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], 0);
            map.put(arr[i], map.get(arr[i])+1);
        }
        System.out.println("Enter Element to get what you want..");
        int element = sc.nextInt();
        int sum =0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
            if(element==entry.getValue())
                sum = sum+entry.getKey();
        System.out.println("sum= "+sum);
        sc.close();
    }
}