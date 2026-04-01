import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        StringBuilder result = new StringBuilder();

        // 문자열을 하나씩 꺼내서 확인합니다.
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        
        // 최종 결과 출력
        System.out.println(result.toString());
    }
}