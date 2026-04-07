class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        // 사람이 피자 조각으로 딱 나누어 떨어지는 경우
        if (n % slice == 0) {
            answer = n / slice;
        } 
        // 나머지가 생기는 경우 (한 판 더 시켜야 함)
        else {
            answer = (n / slice) + 1;
        }
        
        return answer;
    }
}