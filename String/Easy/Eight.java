// //9) Write a program to reverse each word in the given string.
// import java.util.*;

// public class Eight {
//     public static void main(String []args){
//         Scanner stringParser = new Scanner(System.in);
//         Scanner intParser = new Scanner(System.in);
//         int n = intParser.nextInt();
//         for(int q=0;q<n;q++){
//             String str = stringParser.nextLine();
//             Stack<Character> stack = new Stack<Character>();
//             for(int i=0;i<str.length();i++){
//                 stack.push(str.charAt(i));
//             }
//             while(!stack.empty()){
//                 System.out.print(stack.pop());
//             }
//             System.out.println();
//         }
//         stringParser.close();
//         intParser.close();
//     }
// }
// above with stack
//now with java stream

import java.util.*;
import java.util.stream.Collectors;
class Eight{
    public static void main(String []args){
        Scanner intParser = new Scanner(System.in);
        Scanner stringParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            String str = stringParser.nextLine();
            String result = Arrays.asList(str.split(" ")).stream().map(s-> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
            System.out.println(result);
        }
        intParser.close();
        stringParser.close();
    }
}