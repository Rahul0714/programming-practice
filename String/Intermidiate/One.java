//1) Write a Code to check whether one string is a rotation of another

import java.util.*;
class One{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int q=0;q<num;q++){
            String str1 = sc.next();
            String str2 = sc.next();
            str1 = str1.concat(str1);
            if(str1.contains(str2))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}