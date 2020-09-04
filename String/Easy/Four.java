//4) Find Duplicate characters in a string.

import java.util.*;
public class Four {
    public static void main(String []args){
        Scanner stringParser = new Scanner(System.in);
        Scanner intParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            String str = stringParser.nextLine();
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            for(int i=0;i<str.length();i++){
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i), 0);
                }
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey());
                }
            }
        }
        stringParser.close();
        intParser.close();
    }
}