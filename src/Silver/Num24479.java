package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

// Silver 2 알고리즘 수업 - 깊이 우선 탐색 1
public class Num24479 {
    static int N, M, R;
    static List<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        DFS(R);
    }
    private static void DFS(int start) {
        Stack<Integer> stack = new Stack<>();
        int[] order = new int[N + 1];
        int cnt = 1;

        for (int i = 1; i <= N ; i++) {
            graph[i].sort((a, b) -> b - a); // 내림차순 정렬
        }

        stack.push(start);
        while(!stack.isEmpty()) {
            int current = stack.pop();
            if(!visited[current]) {
                visited[current] = true;
                order[current] = cnt++;

                for (int next : graph[current]) {
                    if(!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(order[i]).append("\n");
        }
        System.out.println(sb);
    }
}
