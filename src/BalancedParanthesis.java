

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String exp1 = "[{()}]";
        if(withStack(exp1))
            System.out.println("This is a balanced expression");
        else
            System.out.println("This is a unbalanced expression");
        String exp2 = "[{()}]{}";
        if(withoutStack(exp1))
            System.out.println("This is a balanced expression");
        else
            System.out.println("This is a unbalanced expression");

    }

    public static boolean withStack(String exp){
        if(exp.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<exp.length();i++){
                char current = exp.charAt(i);
                if(current == '{' || current =='[' || current == '('){
                    stack.push(current);
                }
                if(current == '}' || current ==']' || current == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    else{
                        char last = stack.peek();
                        if(current == '}' && last == '{' || current == ']' && last == '[' || current == ')' && last == '(' ){
                            stack.pop();
                        }
                    }
                }
        }

        return (stack.isEmpty())? true : false;
    }

    public static boolean withoutStack(String exp){
        if(exp.isEmpty()) return true;
        int count = 0 ;
        for(int i=0;i<exp.length();i++){
            char current = exp.charAt(i);
            if(current == '{' || current =='[' || current == '('){
                count++;
            }
            if(current == '}' || current ==']' || current == ')'){
                if(count == 0){
                    return false;
                }
                else{
                    count--;
                    if(current == '}' && last == '{' || current == ']' && last == '[' || current == ')' && last == '(' ){
                        stack.pop();
                    }
                }
            }
        }

        return (stack.isEmpty())? true : false;
    }
}
