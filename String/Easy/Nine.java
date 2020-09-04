//9) Check whether the String is a palindrome or not.

import java.util.*;
public class Nine {
    public static void main(String []args){
        Scanner intParser = new Scanner(System.in);
        Scanner stringParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            int len = intParser.nextInt();
            char str[] = new char[len];
            String strTemp = stringParser.next();
            for(int i=0;i<len;i++)
            str[i] = strTemp.charAt(i);
            int j =strTemp.length()-1;
            boolean check = true;
            for(int i=0;i<strTemp.length();i++){
                if(str[i]!=str[j]){
                check =false;
                break;
                }
                j--;
            }
            if(check)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        stringParser.close();
        intParser.close();
    }
}