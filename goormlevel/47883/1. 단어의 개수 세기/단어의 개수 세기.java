import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // 현재가 문자이고
            if (s.charAt(i) != ' ') {

                // 첫 번째 문자이거나, 바로 앞이 공백이면
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
