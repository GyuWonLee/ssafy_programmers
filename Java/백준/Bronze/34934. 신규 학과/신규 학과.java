import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String result = "";

        for (int i = 0; i < N; i++) {
            String deptName = sc.next();
            int year = sc.nextInt();

            if (year == 2026) {
                result = deptName;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}