import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[M];

            for (int i = 0; i < N; i++) A[i] = sc.nextInt();
            for (int i = 0; i < M; i++) B[i] = sc.nextInt();

            // 둘 다 정렬합니다.
            Arrays.sort(A);
            Arrays.sort(B);

            long count = 0;
            int bIdx = 0;

            // 2. A를 하나씩 확인하면서 B의 어디까지가 A[i]보다 작은지 찾습니다.
            for (int i = 0; i < N; i++) {
                // B의 값이 A[i]보다 작으면 계속 오른쪽으로 이동
                while (bIdx < M && B[bIdx] < A[i]) {
                    bIdx++;
                }
                // bIdx는 현재 A[i]보다 작은 B 원소들의 개수와 같습니다.
                count += bIdx;
            }
            System.out.println(count);
        }
    }
}