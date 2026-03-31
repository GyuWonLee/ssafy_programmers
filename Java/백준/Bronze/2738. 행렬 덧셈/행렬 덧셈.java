import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrA = new int[100][100];
        int[][] arrB = new int[100][100];

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arrA[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arrB[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(arrA[i][j] + arrB[i][j] + " ");
            }
            System.out.println();
        }

    }
}
