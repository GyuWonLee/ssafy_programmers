import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N : 바구니 개수, M : 공을 넣는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 0으로 초기화된 크기 N의 배열 생성
        int[] arr = new int[N];

        // M번 공을 넣는 과정을 반복
        for (int m = 0; m < M; m++) {
            int i = sc.nextInt(); // i번 바구니부터
            int j = sc.nextInt();   // j번 바구니까지
            int k = sc.nextInt(); // k번 공을 넣는다

            
            for (int index = i - 1; index < j; index++) {
                arr[index] = k; // 기존 공을 빼고 새 공을 넣음 (덮어쓰기)
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}