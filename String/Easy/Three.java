//3) Write a program to remove all whitespaces in a given string.
// import java.util.*;
// public class Three {
//     public static void main(String []args){
//         Scanner intParser = new Scanner(System.in);
//         Scanner stringParser = new Scanner(System.in);
//         int n = intParser.nextInt();
//         for(int q=0;q<n;q++){
//             String str = stringParser.nextLine();
//             String ans = "";
//             for(int i=0;i<str.length();i++){
//                 if((int)str.charAt(i)!=32){
//                     ans += Character.toString(str.charAt(i));
//                 }
//             }
//             System.out.println(ans);
//         }
//         stringParser.close();
//         intParser.close();
//     }
// }

//using replaceAll()

import java.util.*;
class Three{
    public static void main(String []args){
        Scanner intParser = new Scanner(System.in);
        Scanner stringParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            String str = stringParser.nextLine();
            str = str.replaceAll("\\s", "");
            System.out.println(str);
        }
        intParser.close();
        stringParser.close();
    }
}