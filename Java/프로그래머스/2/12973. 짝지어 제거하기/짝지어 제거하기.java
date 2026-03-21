import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 스택이 비어있지 않고, 맨 위 글자가 현재 글자와 같다면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 짝을 제거
            } else {
                stack.push(c); // 아니면 스택에 추가
            }
        }

        // 모든 과정을 끝낸 후 스택이 비어있으면 1, 아니면 0 반환
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}