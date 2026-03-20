class Solution {
    public int solution(int n) {
        int count = 0;
        int nCount = Integer.bitCount(n);
        
        while(nCount != count){
            n += 1;
            count = Integer.bitCount(n);
        }
        return n;
    }
}