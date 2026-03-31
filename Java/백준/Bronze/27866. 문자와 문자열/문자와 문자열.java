import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int i = sc.nextInt();

        for(int j = 0; j < S.length(); j++){
            if(j == i - 1){ // i-1 인 이유는 i는 1부터 시작하기 때문, 배열은 0부터 시작하므로, i-1로 접근해야 합니다.
                System.out.println(S.charAt(j));
            }
        }
    }
}
