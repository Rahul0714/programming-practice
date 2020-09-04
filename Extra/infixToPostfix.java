import java.util.*;
class infixToPostfix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        String  postfix= "";
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix = postfix + ch;
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty()&&stack.peek()!='('){
                    postfix = postfix + stack.pop();
                }
                if(!stack.isEmpty()&&stack.peek()!='('){
                    System.out.println("Invalid Expression");
                    break;
                }
                else
                stack.pop();
            }
            else{
                while(!stack.isEmpty()&&precedence(ch)<=precedence(stack.pop())){
                    postfix = postfix + stack.pop();
                }
                stack.push(ch);
            }
            while(!stack.isEmpty()){
                postfix = postfix + stack.pop();
            }
        }
        System.out.println(postfix);
        sc.close();
    }
    static int precedence(char ch){
        switch(ch){
            case '+':
            case '-':
                    return 1;
            case '*':
            case '/':
                    return 2;
            case '^':
                    return 3;
            default:
                    return -1;
        }
    }
}
