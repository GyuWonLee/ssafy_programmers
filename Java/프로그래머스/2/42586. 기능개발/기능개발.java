import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 1. 각 작업이 며칠 걸리는지 미리 계산해서 적어두기 (가장 쉬운 산수)
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            days[i] = (remain + speeds[i] - 1) / speeds[i]; 
        }

        // 2. 배포될 개수를 담을 리스트
        ArrayList<Integer> list = new ArrayList<>();

        // 3. 앞에서부터 하나씩 확인하며 묶기
        int anchor = days[0]; // 첫 번째 작업이 끝나는 날을 기준으로 잡음
        int count = 1;        // 일단 첫 번째 기능은 포함

        for (int i = 1; i < days.length; i++) {
            if (days[i] <= anchor) {
                // 현재 작업이 기준일보다 일찍 끝나면? -> 같이 배포!
                count++;
            } else {
                // 기준일보다 늦게 끝나면? -> 지금까지 쌓인 거 배포하고 새로 시작!
                list.add(count);
                count = 1;       // 개수 초기화
                anchor = days[i]; // 새로운 기준일 설정
            }
        }
        list.add(count); // 마지막으로 남은 뭉치 추가

        // 4. 리스트를 배열로 옮기기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}