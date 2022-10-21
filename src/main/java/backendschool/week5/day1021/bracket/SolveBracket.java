package backendschool.week5.day1021.bracket;

import java.util.Arrays;
import java.util.Stack;

public class SolveBracket {
    public boolean solution1(String s) {

        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean solution2(String s) {

        String[] splitted = s.split("\\(\\)");
        System.out.println(Arrays.toString(splitted));

        return s.length() == 0;
    }

    public boolean solution(String s) {
    // Stack 사용
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if(stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.empty();
    }
}
