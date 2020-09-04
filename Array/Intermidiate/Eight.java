import java.util.*;
//8) Find the first repeating element in an array of integers.
public class Eight {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int n = sc.nextInt();
            int arr[] = new int[n];

            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(!map.containsKey(arr[i]))
                map.put(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
            }
            boolean flag = false;
            for(int i=0;i<n;i++){
                if(map.get(arr[i])>1){
                    System.out.println((i+1));
                    flag = true;
                    break;
                }
            }
            if(flag ==false)
            System.out.println("-1");
        }
        sc.close();
    }
}
/*
import java.util.*;

class Eight{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            boolean flag = false;
            int min=1000;
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                if(set.add(arr[i])==false){
                    System.out.println("damn true");
                    int index = new ArrayList<>(set).indexOf(arr[i]);
                    index++;
                    flag = true;
                    if(index<min)
                    min =index;
                    System.out.println("Get Indexed "+(++index));
                    break;
                }
            }
            if(flag ==false)
            System.out.println("-1");
    }

        sc.close();
    }
}
*/