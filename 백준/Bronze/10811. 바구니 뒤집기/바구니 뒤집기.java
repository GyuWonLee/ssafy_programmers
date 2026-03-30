import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        // 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        // M번 뒤집기
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt() - 1; // 0-index
            int j = sc.nextInt() - 1;

            // reverse
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        // 출력
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}