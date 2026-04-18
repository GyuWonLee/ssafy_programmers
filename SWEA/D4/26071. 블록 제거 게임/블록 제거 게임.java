import java.util.*;

public class Solution {
    static int maxScore;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            List<Integer> blocks = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                blocks.add(sc.nextInt());
            }

            maxScore = 0;
            solve(blocks, 0); // 완전 탐색 시작
            
            System.out.println("#" + t + " " + maxScore);
        }
    }

    static void solve(List<Integer> blocks, int currentScore) {
        // 기저 조건: 모든 블록을 다 깼을 때
        if (blocks.isEmpty()) {
            maxScore = Math.max(maxScore, currentScore);
            return;
        }

        // 각 블록을 깨보는 모든 경우의 수 탐색
        for (int i = 0; i < blocks.size(); i++) {
            int points = calculatePoints(blocks, i);
            int removed = blocks.remove(i); // 1. 블록 제거
            
            solve(blocks, currentScore + points); // 2. 재귀 호출
            
            blocks.add(i, removed); // 3. 백트래킹 (원상 복구)
        }
    }

    // 점수 계산 규칙 처리
    static int calculatePoints(List<Integer> blocks, int index) {
        int size = blocks.size();
        if (size == 1) return blocks.get(0); // 남은 블록 1개
        if (index == 0) return blocks.get(1); // 왼쪽 끝
        if (index == size - 1) return blocks.get(size - 2); // 오른쪽 끝
        
        return blocks.get(index - 1) * blocks.get(index + 1); // 중간 블록
    }
}