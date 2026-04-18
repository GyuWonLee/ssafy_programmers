import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			String arr[] = new String[N];

			// 입력
			for (int i = 0; i < N; i++) {
				arr[i] = sc.next();
			}

			// 로직
			// 6이면 3이됨
			int mid = (N + 1) / 2;
			// 0부터 2까지 012 반복 -> 3번
			System.out.print("#" + tc + " ");
			for (int i = 0; i < mid; i++) { // 왼쪽
				System.out.print(arr[i] + " ");
				if (mid + i < N) { // 오른쪽
					System.out.print(arr[mid + i] + " ");
				}
			}
			System.out.println();
		}

	}

}
