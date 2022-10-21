package backendschool.week5.day1021.bracket;

import java.util.Stack;

public class SolveBracket {
    public boolean solution(String s) {

        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

//    public boolean stackSolution(String s) {
//        boolean answer = false;
//
//        Stack<String> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.)
//        }

        return
    }
}
