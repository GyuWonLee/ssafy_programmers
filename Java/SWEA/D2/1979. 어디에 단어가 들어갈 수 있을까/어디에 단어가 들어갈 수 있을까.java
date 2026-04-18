import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int arr[][] = new int[N][N];

			// 배열입력받기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			System.out.print("#" + tc + " ");

			int count = 0;
			// 가로 검사
			for (int i = 0; i < N; i++) {
				int continueCount = 0; // 연속
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 1) {
						continueCount += 1;
					} else {
						if(continueCount == K) {
							count++;
						}
						continueCount = 0; 
					}
				}
				
				// 줄 끝까지 1로 가득찬 경우
				if(continueCount == K) {
					count++;
				}
			}
			
			
			// 세로검사
			for (int i = 0; i < N; i++) {
				int continueCount = 0;
				for (int j = 0; j < N; j++) {
					if (arr[j][i] == 1) {
						continueCount += 1;
					} else {
						if(continueCount == K) {
							count++;
						}
						continueCount = 0; 
					}
				}
				
				// 줄 끝까지 1로 가득찬 경우
				if(continueCount == K) {
					count++;
				}
			}
			
			
			System.out.println(count);

		}

	}
}
