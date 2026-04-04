import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt(); // K번째 약수

        for(int i = 1; i <= N; i++){
            if(N % i == 0){
                K--; // 약수의 개수를 하나씩 줄여나감
                if(K == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
        if(K > 0){ 
            System.out.println(0);
        }
    }
}