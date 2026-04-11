import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 빵개수
        int M = sc.nextInt(); // 패티개수

        int result = Math.min(N /2, M);

        System.out.println(result);
        
    }
}
