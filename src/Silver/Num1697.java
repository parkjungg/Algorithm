package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Silver 1 숨바꼭질
public class Num1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(BFS(N, K));
    }
    private static int BFS(int N, int K) {
        if(N == K) return 0; // 위치가 같으면 0초 소요
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        queue.add(new int[]{N, 0});


        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int pos = node[0];
            int time = node[1];

            int[] nextPos = {pos - 1, pos + 1, pos * 2};
            for (int next : nextPos) {
                if(next == K) return time + 1;
                if(next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, time + 1});
                }
            }
        }
        return -1;
    }
}
