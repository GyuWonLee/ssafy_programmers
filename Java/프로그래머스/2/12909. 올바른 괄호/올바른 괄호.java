class Solution {
    boolean solution(String s) {
        int balance = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }

            // 중간에 음수가 되면 짝이 맞지 않는 닫는 괄호가 먼저 나온 것
            if (balance < 0) {
                return false;
            }
        }

        // 모든 순회 후 0이면 true, 아니면 false
        return balance == 0;
    }
}