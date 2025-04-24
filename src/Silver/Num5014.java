package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Silver 1 스타트링크
public class Num5014 {
    static int F,S,G,U,D;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        visited = new boolean[F + 1];

        BFS(S);
    }
    private static void BFS(int start) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int pos = current[0];
            int count = current[1];

            if(pos == G) {
                System.out.println(count);
                return;
            }
            if(pos + U <= F && !visited[pos + U]) {
                visited[pos + U] = true;
                queue.add(new int[]{pos + U, count + 1});
            }
            if (pos - D >= 1 && !visited[pos - D]) {
                visited[pos - D] = true;
                queue.add(new int[]{pos - D, count + 1});
            }

        }
        System.out.println("use the stairs");
    }
}
