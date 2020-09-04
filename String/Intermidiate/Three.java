//3) Write a Program to check whether a string is a valid shuffle of two strings or not.

// import java.util.*;
// class Three{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int q=0;q<num;q++){
//             String str1 = sc.next();
//             String str2 = sc.next();
//             String str3 = sc.next();
//             if(checkInterleaved(str1,str2,str3))
//                 System.out.println("Yes");
//             else
//                 System.out.println("No");
//         }
//         sc.close();
//     }
//     static boolean checkInterleaved(String str1,String str2,String str3){
//         int i=0,j=0,k=0;
//         while(k!=str3.length()){
//             if(i<str1.length()&&str1.charAt(i)==str3.charAt(k))
//                 i++;
//             else if(j<str2.length()&&str2.charAt(j)==str3.charAt(k))
//                 j++;
//             else
//                 return false;
//             k++;
//         }
//         if(i<str1.length()||j<str2.length())
//             return false;
//         return true;
//     }
// }
//Not for Common Characters..

// import java.util.*;
// class Three{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int q=0;q<num;q++){
//             String str = sc.next();

//         }
//         sc.close();
//     }
// }
//wait it requare either recursion or dp.
