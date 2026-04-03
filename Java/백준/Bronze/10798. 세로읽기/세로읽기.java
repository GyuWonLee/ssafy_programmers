import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 다섯 줄의 단어를 저장할 배열 선언
        String[] words = new String[5];
        
        // 다섯 줄 입력 받기
        for (int i = 0; i < 5; i++) {
            words[i] = sc.next();
        }

        // 결과를 효율적으로 합치기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        // 2. 세로로 읽기 (열 기준 반복)
        // 각 줄의 최대 길이는 15자이므로 0부터 14까지 반복
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                // 현재 줄(i)의 길이가 지금 읽으려는 위치(j)보다 클 때만 글자를 읽음
                if (j < words[i].length()) {
                    sb.append(words[i].charAt(j));
                }
            }
        }

        // 3. 최종 결과 출력
        System.out.println(sb.toString());
        
        sc.close();
    }
}