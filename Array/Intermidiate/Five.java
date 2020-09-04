/*import java.util.*;
//5) Find duplicates in an array.   
public class Five {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x=0;x<t;x++){
            int n = sc.nextInt();
            Set<Integer> dup = new HashSet<>();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j])
                    dup.add(arr[i]);
                }
            }
            if(dup.size()==0)
            dup.add(-1);
            ArrayList<Integer> temp = new ArrayList<Integer>(dup);
            Collections.sort(temp);
            for(int ch:temp)
            System.out.print(ch+" ");

        }
        sc.close();
    }
}*/
//Time Limit Exceeded...
//New Approach...
/*
import java.util.*;

class Five{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int arr1[] = new int[n];
            for(int j=0;j<n;j++)
            arr[j] = sc.nextInt();
            for(int j=0;j<n;j++)
            arr1[j] = arr[j];
            for(int k=0;k<n;k++)
            arr[arr[k]%n] = arr[arr[k%n]%n] +n;
            for(int ch:arr)
            System.out.print(ch);
            System.out.println();
            for(int k=0;k<n;k++){
                if(arr[k]>=(n*2)){
                    System.out.print(arr1[k]+" ");
                }
            }
        }
        sc.close();
    }
}
*/

import java.util.*;

class Five{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0;k<t;k++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            Set<Integer> arrayList = new HashSet<Integer>();
            for(int i=0;i<n;i++){
                if(set.add(arr[i])==false)
                arrayList.add(arr[i]);
            }
            if(arrayList.size()==0)
            arrayList.add(-1);
            ArrayList<Integer> temp = new ArrayList<Integer>(arrayList);
            Collections.sort(temp);
            for(int ch:temp)
            System.out.print(ch+" "); 
        }
        sc.close();
    }
}