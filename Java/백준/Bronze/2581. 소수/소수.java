import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = M; i <= N; i++){
            if (i < 2) continue;

            boolean isPrime = true; // 소수라 가정
            
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                sum += i;
                if(i < min) min = i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {

            System.out.println(sum);
            System.out.println(min);
        }
    }
}
