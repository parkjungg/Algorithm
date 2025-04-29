package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Gold 5 뱀과 사다리 게임
public class Num16928 {
    static int N, M;
    static boolean[] visited;
    static List<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[101];
        graph = new ArrayList[101];

        for (int i = 1; i < 101; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());

            graph[start].add(dest);
        }
        BFS(1);
    }
    static void BFS(int start) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int pos = current[0];
            int count = current[1];

            if(pos == 100) {
                System.out.println(count);
                return;
            }

            for (int i = 1; i <= 6; i++) {
                int next = pos + i;
                if(next > 100) continue;

                if(!graph[next].isEmpty()) {
                    next = graph[next].get(0);
                }
                if(!visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, count + 1});
                }
            }
        }
    }
}
