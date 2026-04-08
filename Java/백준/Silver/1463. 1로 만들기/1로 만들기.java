import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 1. 배열 준비! (N까지 담아야 하니까 크기는 N+1)
        int[] dp = new int[N + 1];
        
        // 2. 2부터 N까지 차례대로 최소 횟수를 계산해요.
        for (int i = 2; i <= N; i++) {
            
            // [방법 A] 무조건 1을 빼는 경우 (즉, i-1에서 온 경우)
            // 일단 이걸 기본값으로 정해둡니다.
            dp[i] = dp[i - 1] + 1;
            
            // [방법 B] 2로 나누어 떨어지는 경우
            // "1을 뺀 것"과 "2로 나눈 곳에서 온 것" 중 뭐가 더 적게 걸릴까?
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // [방법 C] 3으로 나누어 떨어지는 경우
            // 위에서 고른 최솟값과 "3으로 나눈 곳에서 온 것"을 또 비교!
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        
        // 3. 최종적으로 N번 칸에 적힌 숫자가 정답!
        System.out.println(dp[N]);
    }
}