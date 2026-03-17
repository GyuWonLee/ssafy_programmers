class Solution {
    public int solution(int n) {
        int count = 0;
        int start = 1, end =1;
        int sum = 1;
        
    while(start <= n) {
        if(sum < n) {
            end++;
            sum += end;
        } else if (sum == n){
            count++;
            sum -= start;
            start++;
        }else{
            sum -= start;
            start++;
        }
    }
    return count;
        
    }
    
}