package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Silver 1 케빈 베이컨의 6단계 법칙
public class Num1389 {
    static int N,M;
    static List<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[] result = new int[N+1];
        graph = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            graph[A].add(B);
            graph[B].add(A);
        }
        for (int i = 1; i <= N; i++) {
            result[i] = BFS(i);
        }

        int min  = Integer.MAX_VALUE;
        int person = 0;

        for (int i = 1; i <= N ; i++) {
            if(result[i] < min) {
                min = result[i];
                person = i;
            }
        }
        System.out.println(person);
    }

    private static int BFS(int start) {
        boolean[] visited = new boolean[N+1];
        Queue<int[]> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(new int[]{start, 0});
        int count = 0;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int person = current[0];
            int depth = current[1];
            count += depth;

            for (int next : graph[person]) {
                if(!visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, depth + 1});
                }
            }
        }
        return count;
    }
}
