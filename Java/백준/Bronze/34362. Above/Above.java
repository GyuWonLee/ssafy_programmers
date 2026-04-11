import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값이 있는지 확인 후 고도 N을 읽음
        if (sc.hasNextDouble()) {
            double n = sc.nextDouble();

            // 현재 고도에서 해수면 상승치 0.3m를 뺌
            double result = n - 0.3;

            // 결과 출력 (소수점 아래 자릿수는 넉넉하게 출력해도 됨)
            System.out.println(result);
        }

        sc.close();
    }
}