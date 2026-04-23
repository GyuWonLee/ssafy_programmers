import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {

        // 각 수포자의 찍는 패턴
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 점수 변수
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        // 정답 배열을 끝까지 순회
        for (int i = 0; i < answers.length; i++) {

            // i % 패턴길이 → 패턴 반복
            if (answers[i] == student1[i % student1.length]) {
                score1++;
            }

            if (answers[i] == student2[i % student2.length]) {
                score2++;
            }

            if (answers[i] == student3[i % student3.length]) {
                score3++;
            }
        }

        // 최고 점수 구하기
        int max = Math.max(score1, Math.max(score2, score3));

        List<Integer> list = new ArrayList<>();

        // 최고 점수와 같은 사람 추가 (오름차순 자동 유지)
        if (score1 == max) list.add(1);
        if (score2 == max) list.add(2);
        if (score3 == max) list.add(3);

        // 리스트 → 배열 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}