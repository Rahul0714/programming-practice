import java.util.*;
class pangrams{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        char ch = 65;
        boolean check = true;
        for(int i=0;i<26;i++){
            if(!input.contains(Character.toString(ch++)))
                check = false;
        }
        if(check)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        sc.close();
    }   
}