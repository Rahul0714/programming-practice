import java.util.*;
//7) Find common elements in three sorted arrays.
public class Seven {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int o = sc.nextInt();
            Set<Integer> set1 = new HashSet<Integer>();
            Set<Integer> set2 = new HashSet<Integer>();
            Set<Integer> set3 = new HashSet<Integer>();
            for(int i=0;i<m;i++)
            set1.add(sc.nextInt());
            for(int i=0;i<n;i++)
            set2.add(sc.nextInt());
            for(int i=0;i<o;i++)
            set3.add(sc.nextInt());
            set1.retainAll(set2);
            set1.retainAll(set3);
            ArrayList<Integer> arrayList = new ArrayList<Integer>(set1);
            Collections.sort(arrayList);
            if(arrayList.size()==0)
            arrayList.add(-1);
            for(int ch:arrayList)
            System.out.print(ch+" ");
            System.out.println();
        }
        sc.close();
    }    
}   

//Now Anish's Solution.(See Later some errors!!)
/*import java.util.*;

class Seven{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            int arr3[] = new int[n3];
            for(int i=0;i<n1;i++)
            arr1[i] = sc.nextInt();
            for(int i=0;i<n2;i++)
            arr2[i] = sc.nextInt();
            for(int i=0;i<n3;i++)
            arr3[i] = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
            for(int i=0;i<n1;i++){
                if(!map.containsKey(arr1[i])){
                    map.put(arr1[i],0); 
                }
                else{
                    map.put(arr1[i],map.get(arr1[i])+1);
                }
            }
            for(int i=0;i<n2;i++){
                if(!map.containsKey(arr2[i])){
                    map.put(arr2[i],0); 
                }
                else{
                    map.put(arr2[i],map.get(arr2[i])+1);
                }
            }
            for(int i=0;i<n3;i++){
                if(!map.containsKey(arr3[i])){
                    map.put(arr3[i],0); 
                }
                else{
                    map.put(arr3[i],map.get(arr3[i])+1);
                }
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for(int i=0;i<n1;i++){
                if(map.get(arr1[i])==3)
                arrayList.add(arr1[i]);
            }
            for(int i=0;i<n2;i++){
                if(map.get(arr2[i])==3)
                arrayList.add(arr2[i]);
            }
            for(int i=0;i<n3;i++){
                if(map.get(arr3[i])==3)
                arrayList.add(arr3[i]);
            }
            if(arrayList.size()==0)
            arrayList.add(-1);
            for(int ch:arrayList)
            System.out.print(ch+" ");
        }
        sc.close();
    }
}
*/