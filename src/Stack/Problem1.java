package Stack;

import java.util.Stack;

/**
 * @author sanhuzhen
 * @time 3/8/25 4:27 PM
 */
public class Problem1 {
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('||c=='['||c=='{') stack.push(c);
            if (!stack.isEmpty()){
                if (c==')'&&stack.peek()=='(') stack.pop();
                if (c==']'&&stack.peek()=='[') stack.pop();
                if (c=='}'&&stack.peek()=='{') stack.pop();
            }else{
                return false;
            }

        }
        return stack.isEmpty();
    }
}
