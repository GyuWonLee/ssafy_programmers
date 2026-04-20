import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] arr = new int[1002][1002];

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();

			for (int r = x; r < x + width; r++) {
				for (int z = y; z < y + height; z++) {
					arr[r][z] = i + 1; // 1번부터 시작
				}
			}
		}

		int[] count = new int[N + 1];
		for (int i = 0; i < 1002; i++) {
			for(int j = 0; j < 1002; j++) {
				if(arr[i][j] != 0) {
					count[arr[i][j]]++;
				}
			}
		}
		
		for(int i = 1; i <= N; i++) {
			System.out.println(count[i]);
		}

	}
}
