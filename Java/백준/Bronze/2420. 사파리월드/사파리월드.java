import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong(); 

        long result = Math.abs(A - B); // 두 서브도메인의 유명도 차이 계산
        System.out.println(result);
    }
}
