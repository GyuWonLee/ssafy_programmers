class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                count++;

                // 가격이 떨어지면 바로 종료
                if (prices[j] < prices[i]) {
                    break;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}