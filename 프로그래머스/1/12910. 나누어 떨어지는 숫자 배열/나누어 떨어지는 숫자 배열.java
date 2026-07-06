import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();

        // divisor로 나누어 떨어지는 값만 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }

        // 해당 값이 하나도 없으면 [-1] 반환
        if (result.size() == 0) {
            return new int[] {-1};
        }

        // 오름차순 정렬
        Collections.sort(result);

        // ArrayList -> int 배열 변환
        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}