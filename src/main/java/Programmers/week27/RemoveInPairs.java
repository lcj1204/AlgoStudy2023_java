package Programmers.week27;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveInPairs {

    public static void main(String[] args) {
        System.out.println(solution("caca")); // 예시 문자열
    }

    public static int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
//        LinkedList

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
