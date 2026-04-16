import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        // (우선순위, 인덱스) 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            // 더 높은 우선순위가 있는지 확인
            boolean hasHigher = false;
            for (int[] q : queue) {
                if (q[0] > current[0]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if (hasHigher) {
                // 다시 큐 뒤로
                queue.offer(current);
            } else {
                // 실행
                answer++;
                
                if (current[1] == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}