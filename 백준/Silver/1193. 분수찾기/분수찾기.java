import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int line = 1; // 현재 사선 번호 (1번 사선, 2번 사선...)
        int sum = 0;  // 해당 사선까지의 누적 칸 수

        while (true) {
            if (X <= sum + line) {
                int offset = X - sum;
                
                if (line % 2 == 0) {
                    System.out.println(offset + "/" + (line - offset + 1));
                } else {
                    System.out.println((line - offset + 1) + "/" + offset);
                }
                break;
            }
            sum += line;
            line++;
        }
        
        sc.close();
    }
}