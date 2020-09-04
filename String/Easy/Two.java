//2) Write a program to count the number of occurrences of each character in the string and print it.
// import java.util.*;

// public class Two {
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int si = sc.nextInt();
//         for(int q=0;q<si;q++){
//             int count =0;
//             String str = sc.next();
//             for(int i=0;i<str.length();i++){
//                 for(int j=0;j<str.length();j++){
//                     if(str.charAt(i)==str.charAt(j))
//                     count++;
//                 }
//                 System.out.println("Count of "+str.charAt(i)+count);
//                 count =0;
//             }
//         }
//         sc.close();
//     }
// }
//Complete naive

import java.util.*;
class Two{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt();
        for(int q=0;q<si;q++){
            String str = sc.next();
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), 0);
                }
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            } 
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
        sc.close();
    }
}