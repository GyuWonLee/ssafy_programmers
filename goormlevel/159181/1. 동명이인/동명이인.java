import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();

        int count = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();

            if (name.contains(S)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
