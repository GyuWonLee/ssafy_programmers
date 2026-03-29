import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 개수 입력 받기
        int N = sc.nextInt();
        
        // 배열 생성 및 입력 받기
        int arr[] = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 찾고 싶은 숫자 입력 받기
        int v = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] == v){
                count++;
            }
        }   
        System.out.println(count);
    }
}
