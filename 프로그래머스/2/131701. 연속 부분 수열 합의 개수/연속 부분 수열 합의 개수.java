import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        // 1. 중복 제거를 위해 HashSet 사용
        Set<Integer> sums = new HashSet<>();
        
        // 2. 배열을 두 배로 확장하여 원형 구조 처리
        int[] extended = new int[n * 2];
        for (int i = 0; i < n; i++) {
            extended[i] = elements[i];
            extended[i + n] = elements[i];
        }
        
        // 3. 길이가 1부터 n까지인 부분 수열의 합 구하기
        for (int len = 1; len <= n; len++) {
            // 시작 위치별로 합을 구함
            for (int i = 0; i < n; i++) {
                int sum = 0;
                // 현재 길이만큼 더하기
                for (int j = i; j < i + len; j++) {
                    sum += extended[j];
                }
                sums.add(sum);
            }
        }
        
        return sums.size();
    }
}