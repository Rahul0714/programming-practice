import java.util.*;
public class pickingUpNumbers {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i],0);
            map.put(arr[i],map.get(arr[i])+1);
        }
        int temp =0,max = Integer.MIN_VALUE,value =0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            value = entry.getKey();
            if(map.get(value)>max){
                if(map.containsKey(value-1)||(map.containsKey(value+1))){
                    max = map.get(value);
                    temp = value;
                }
                else{
                    max = 0;
                    value = 0;
                }
            }
        }
        if(map.size()==1)
            System.out.println(n);
        else if(!map.containsKey(temp-1))
            System.out.println(map.get(temp+1)+max);
        else if(!map.containsKey(temp+1))
            System.out.println(map.get(temp-1)+max);
        else{
            if(map.get(temp-1)>map.get(temp+1))
            System.out.println(map.get(temp-1)+max);
            else
            System.out.println(map.get(temp+1)+max);
        }
        sc.close();
    }
}