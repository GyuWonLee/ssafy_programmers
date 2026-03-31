import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N : 바구니 개수, M : 공을 바꾸는 횟수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 0으로 초기화된 크기 N의 배열 생성
        int[] arr = new int[N];

        // 초기 바구니에 번호와 같은 공이 들어있도록 설정
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 바구니 번호는 1부터 시작하므로 i+1로 설정
        }

        // M번 공을 바꾸는 과정을 반복
        for(int m = 0; m < M; m++){
            int i = sc.nextInt(); // i번 바구니
            int j = sc.nextInt(); // j번 바구니

            // 공을 서로 교환
            int temp = arr[i - 1]; // 배열은 0부터 시작하므로 i-1과 j-1로 접근
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }


        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
