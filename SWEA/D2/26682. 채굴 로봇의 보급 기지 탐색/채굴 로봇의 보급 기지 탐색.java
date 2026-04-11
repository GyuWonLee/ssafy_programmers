import java.util.*;

public class Solution {
    // 1. 방향 설정 (상, 하, 좌, 우 순서 고정)
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static String[] dirNames = {"UP", "DOWN", "LEFT", "RIGHT"};

    // 2. 위치 및 경로 정보를 저장할 클래스
    static class Node {
        int r, c;       // 현재 좌표 (Row, Column)
        int firstDir;   // 이 경로가 시작점에서 '처음' 출발했던 방향 인덱스

        Node(int r, int c, int firstDir) {
            this.r = r;
            this.c = c;
            this.firstDir = firstDir;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt(); // 격자 세로 크기
            int M = sc.nextInt(); // 격자 가로 크기
            char[][] map = new char[N][M];
            int startR = -1, startC = -1;

            // [입력] 격자 정보 저장 및 LUNA(T) 위치 탐색
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    map[r][c] = sc.next().charAt(0);
                    if (map[r][c] == 'T') {
                        startR = r;
                        startC = c;
                    }
                }
            }

            // [실행 및 결과 출력]
            String result = findShortestPath(N, M, map, startR, startC);
            System.out.println("#" + tc + " " + result);
        }
    }

    static String findShortestPath(int N, int M, char[][] map, int startR, int startC) {
        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        // ------------------------------------------------------
        // [BFS 단계 1] 시작점에서 인접한 4방향 먼저 확인 (첫 이동 결정)
        // ------------------------------------------------------
        for (int d = 0; d < 4; d++) {
            int nr = startR + dr[d];
            int nc = startC + dc[d];

            // 맵 범위 내이고 암석(W)이 아닌 경우
            if (nr >= 0 && nr < N && nc >= 0 && nc < M && map[nr][nc] != 'W') {
                if (map[nr][nc] == 'S') return dirNames[d]; // 바로 옆이 기지라면 즉시 반환
                
                visited[nr][nc] = true;
                queue.add(new Node(nr, nc, d)); // 이 경로는 d방향으로 시작됨을 저장
            }
        }
        
        visited[startR][startC] = true; // 시작점 방문 처리

        // ------------------------------------------------------
        // [BFS 단계 2] 최단 경로 탐색
        // ------------------------------------------------------
        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            for (int d = 0; d < 4; d++) {
                int nr = curr.r + dr[d];
                int nc = curr.c + dc[d];

                // 범위 체크 + 미방문 체크 + 이동 가능 여부(W 아님) 체크
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && map[nr][nc] != 'W') {
                    
                    // 보급 기지(S) 발견 시, 이 노드가 가진 '첫 이동 방향'이 정답
                    if (map[nr][nc] == 'S') {
                        return dirNames[curr.firstDir];
                    }

                    visited[nr][nc] = true;
                    // 부모의 firstDir를 자식 노드에게 그대로 전달 (경로 추적)
                    queue.add(new Node(nr, nc, curr.firstDir));
                }
            }
        }

        return "NONE"; // 어떤 보급 기지에도 도달할 수 없는 경우
    }
}