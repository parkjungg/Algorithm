package Silver;

import java.util.*;

public class Num1260 {
    static List<Integer>[] node;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        node = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            node[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();
            node[node1].add(node2);
            node[node2].add(node1);
        }
        // 노드별로 간선 리스트 정렬 (DFS와 BFS의 방문 순서를 위해)
        for (int i = 1; i <= N; i++) {
            node[i].sort(Integer::compareTo);
        }
        dfs(V);
        System.out.println();

        // 방문 기록 초기화
        visited = new boolean[N + 1];
        bfs(V);
        sc.close();
    }
    public static void dfs(int nodeNum) {
        visited[nodeNum] = true; // 방문했음을 체크
        System.out.print(nodeNum + " ");
        for(int nextNode : node[nodeNum]) {
            if(!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
    public static void bfs(int nodeNum) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(nodeNum); // 시작 노드 큐에 넣기
        visited[nodeNum] = true; // 방문한 노드 체크

        while(!queue.isEmpty()) {
            int currentNode = queue.poll(); // 큐에서 노드 꺼내기
            System.out.print(currentNode + " ");

            for(int nextNode : node[currentNode]) {
                if(!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.offer(nextNode); // 큐에 넣기
                }
            }
        }
    }
}
