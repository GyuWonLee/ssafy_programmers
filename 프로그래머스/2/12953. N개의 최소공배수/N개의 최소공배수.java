class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // 현재까지의 최소공배수와 다음 수의 최소공배수를 구함
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }

    // 두 수의 최대공약수를 구하는 함수 (유클리드 호제법)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 두 수의 최소공배수를 구하는 함수
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}