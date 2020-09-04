//2) Write a program to remove Duplicate characters from the String.

// import java.util.*;
// public class Two {
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int q=0;q<num;q++){
//             String str = sc.next();
//             HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//             for(int i=0;i<str.length();i++){
//                 if(!map.containsKey(str.charAt(i)))
//                     map.put(str.charAt(i), 0);
            
//             map.put(str.charAt(i), map.get(str.charAt(i))+1);
//             }
//             String ans = "";
//             for(Map.Entry<Character,Integer> entry: map.entrySet()){
//                 ans += entry.getKey();
//             }
//             System.out.println(ans);
//         }
//         sc.close();
//     }   
// }
//Correct but not printing ans in sequence as input.
//something... that map is inserting in differnet order or may be retrieving in different order.
//now using LinkedHashSet (arghrghr!!! mad used set instead it doesn't allow duplicates)

// import java.util.*;
// class Two{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int q=0;q<num;q++){
//             String str = sc.next();
//             HashSet<Character> set = new HashSet<Character>();
//             for(int i=0;i<str.length();i++)
//                 set.add(str.charAt(i));
//             Iterator<Character> iter = set.iterator();
//             while(iter.hasNext())
//                 System.out.print(iter.next());
//         }
//         sc.close();
//     }
// }

//Arghrgh!!! again
import java.util.*;
class Two{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            String str = sc.next();
            LinkedHashSet<Character> set = new LinkedHashSet<Character>();
            for(int i=0;i<str.length();i++)
                set.add(str.charAt(i));
            // //print using iterator
            // Iterator<Character> iter = set.iterator();
            // while(iter.hasNext())
            // System.out.print(iter.next());
            //print using for each
            set.forEach(i->System.out.print(i));
        }
        sc.close();
    }
}
//finaly....!!!!



