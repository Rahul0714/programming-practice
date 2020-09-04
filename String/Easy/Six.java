//6) Write a program to check whether given two strings are anagram or not.
import java.util.*;
public class Six {
    public static void main(String []args){
        Scanner stringParser = new Scanner(System.in);
        Scanner intParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            String str1 = stringParser.nextLine();
            String str2 = stringParser.nextLine();
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(int i=0;i<str1.length();i++){
                if(!map.containsKey(str1.charAt(i))){
                    map.put(str1.charAt(i),0);
                }
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            }
            for(int i=0;i<str2.length();i++){
                if(!map.containsKey(str2.charAt(i))){
                    System.out.println("NO");
                }
                map.put(str2.charAt(i), map.get(str2.charAt(i))+1);
            }
        }
        intParser.close();
        stringParser.close();
    }
}