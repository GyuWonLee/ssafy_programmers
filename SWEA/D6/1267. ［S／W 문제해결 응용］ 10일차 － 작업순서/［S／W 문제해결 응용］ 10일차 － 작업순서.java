import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스는 총 10개
        for (int t = 1; t <= 10; t++) {
            int V = sc.nextInt(); // 정점 개수
            int E = sc.nextInt(); // 간선 개수

            ArrayList<Integer>[] adj = new ArrayList[V + 1];
            int[] inDegree = new int[V + 1];

            for (int i = 1; i <= V; i++) {
                adj[i] = new ArrayList<>();
            }

            // 간선 정보 입력 처리
            for (int i = 0; i < E; i++) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                adj[from].add(to); // 인접 리스트에 추가
                inDegree[to]++;    // 진입 차수 증가
            }

            // 위상 정렬을 위한 큐
            Queue<Integer> queue = new LinkedList<>();
            
            // 1. 초기 상태: 진입 차수가 0인 노드를 큐에 모두 삽입
            for (int i = 1; i <= V; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(t).append(" ");

            // 2. 큐가 빌 때까지 반복
            while (!queue.isEmpty()) {
                int curr = queue.poll();
                sb.append(curr).append(" ");

                // 현재 노드와 연결된 다음 노드들의 차수를 줄임
                for (int next : adj[curr]) {
                    inDegree[next]--;
                    
                    // 차수가 0이 되면 이제 시작할 수 있는 작업임
                    if (inDegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }

            System.out.println(sb.toString());
        }
        sc.close();
    }
}