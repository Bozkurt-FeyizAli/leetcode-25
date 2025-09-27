import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(char c: s.toCharArray()){
            if(cp(c)<3)
                stack.push(c);
            else if(stack.isEmpty()) return false;
            else if(cp(stack.peek())+cp(c)==5)
                stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    public static int cp(char c){
        String s="{[()]}";
        return s.indexOf(Character.toString(c));
    }
}