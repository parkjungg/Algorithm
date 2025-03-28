package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Gold 4 숨바꼭질 2
public class Num12851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        BFS(N, K);
    }
    private static void BFS(int N, int K) {
        if(N == K) {
            System.out.println(0 + "\n" + 1);
            return;
        }
        Queue<int[]> queue = new LinkedList<>();
        int[] visited = new int[100001];
        int resultTime = Integer.MAX_VALUE;
        int resultNum = 0;

        queue.add(new int[]{N, 0});
        visited[N] = 1;


        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int pos = node[0];
            int time = node[1];

            if(pos == K) {
                if(resultTime > time) {
                    resultTime = time;
                    resultNum = 1;
                } else if (resultTime ==  time) {
                    resultNum++;
                }
                continue;
            }
            int[] nextPos = {pos - 1, pos + 1, pos * 2};
            for (int next : nextPos) {
                if(next >= 0 && next <= 100000) {
                    if (visited[next] == 0 || visited[next] == time + 1) {
                        queue.add(new int[]{next, time + 1});
                        visited[next] = time + 1;
                    }
                }
            }
        }
        System.out.println(resultTime + "\n" + resultNum);
    }
}
