import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 도화지 준비 (경계선 체크를 편하게 하기 위해 102x102로 크게 만듭니다)
        int[][] paper = new int[102][102];
        int N = sc.nextInt(); // 색종이의 개수

        // 2. 색종이 붙이기 (도화지에 1로 표시)
        for (int k = 0; k < N; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 시작점(x, y)부터 가로 10, 세로 10만큼 1로 채움
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    paper[i][j] = 1;
                }
            }
        }

        // 3. 둘레 계산하기 (사방 탐색)
        int totalPerimeter = 0;
        
        // 상하좌우를 살피기 위한 방향 배열 (dr: 행 이동, dc: 열 이동)
        int[] dr = {-1, 1, 0, 0}; 
        int[] dc = {0, 0, -1, 1};

        // 도화지 전체를 순회
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                
                // 만약 현재 칸이 색종이(1)라면?
                if (paper[i][j] == 1) {
                    
                    // 주변 4방향을 검사한다!
                    for (int d = 0; d < 4; d++) {
                        int nr = i + dr[d];
                        int nc = j + dc[d];

                        // 주변 칸이 0(빈 공간)이라면, 그쪽 방향은 '둘레'가 됩니다.
                        // (배열을 102로 잡았기 때문에 경계면 밖도 0으로 취급되어 자동으로 계산됨)
                        if (paper[nr][nc] == 0) {
                            totalPerimeter++;
                        }
                    }
                }
            }
        }

        // 4. 결과 출력
        System.out.println(totalPerimeter);
    }
}