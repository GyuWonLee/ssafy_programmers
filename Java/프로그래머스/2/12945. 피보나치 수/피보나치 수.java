class Solution {
    public int solution(int n) {
        // n이 0이나 1일 경우 그대로 반환
        if(n <= 1){
            return n;
        }
        
        int prev = 0;
        int curr = 1;
        int answer = 0;
        
        for(int i = 2; i <= n; i++){
            answer = (prev + curr) % 1234567;
            prev = curr;
            curr = answer;
        }
        
        return answer;
        
    }
}