import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 고도 입력 (실수형)
        if (sc.hasNextDouble()) {
            double n = sc.nextDouble();
            
            // 30cm(0.3m)만큼 고도가 낮아짐
            double result = n - 0.3;
            
            // 결과 출력
            System.out.println(result);
        }
        
        sc.close();
    }
}