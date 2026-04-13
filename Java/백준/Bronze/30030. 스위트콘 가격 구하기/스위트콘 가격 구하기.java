import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 부가가치세가 포함된 가격 B 입력
        long B = sc.nextLong();
        
        // 부동소수점 오차를 피하기 위해 정수 연산(B * 10 / 11) 수행
        long A = (B * 10) / 11;
        
        // 원래 가격 A 출력
        System.out.println(A);
        
        sc.close();
    }
}