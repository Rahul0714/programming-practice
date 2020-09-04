//5) Write a program to reverse the string in place.
import java.util.*;

public class Five {
    public static void main(String []args){
        Scanner stringParser = new Scanner(System.in);
        Scanner intParser = new Scanner(System.in);
        int n = intParser.nextInt();
        for(int q=0;q<n;q++){
            String str = stringParser.nextLine();
            char []strString = new char[str.length()];
            for(int i=0;i<str.length();i++){
                strString[i] = str.charAt(i);
            }
            char temp;
            int j = strString.length-1,i=0;      
            while(i<j){
                temp = strString[i];
                strString[i] = strString[j];
                strString[j] = temp;
                i++;
                j--;
            }
            for(char ch:strString)
            System.out.print(ch);
            System.out.println();
        }
        stringParser.close();
        intParser.close();
    }
}