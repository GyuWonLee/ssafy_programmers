import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄에서 테스트 케이스 개수 읽기
        if (!sc.hasNextInt()) return;
        int T_cases = Integer.parseInt(sc.nextLine()); 

        for (int tc = 1; tc <= T_cases; tc++) {
            // 한 줄을 통째로 읽어 K와 암호문 분리
            String line = sc.nextLine();
            int firstSpace = line.indexOf(' ');
            
            // K 값 추출 (공백 이전) 및 유효 범위 조절
            int K = Integer.parseInt(line.substring(0, firstSpace));
            int shift = K % 26; // 26 이상인 경우 처리
            
            // 암호문 추출 (공백 이후)
            String encrypted = line.substring(firstSpace + 1);
            StringBuilder decrypted = new StringBuilder();

            // 한 글자씩 해독
            for (int i = 0; i < encrypted.length(); i++) {
                char ch = encrypted.charAt(i);

                if (Character.isUpperCase(ch)) {
                    // 대문자 해독: 'A'를 기준으로 위치 계산
                    char decoded = (char) ((ch - 'A' - shift + 26) % 26 + 'A');
                    decrypted.append(decoded);
                } 
                else if (Character.isLowerCase(ch)) {
                    // 소문자 해독: 'a'를 기준으로 위치 계산
                    char decoded = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                    decrypted.append(decoded);
                } 
                else {
                    // 숫자, 공백, 특수문자는 그대로 유지
                    decrypted.append(ch);
                }
            }

            System.out.println("#" + tc + " " + decrypted.toString());
        }
        sc.close();
    }
}