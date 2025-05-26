package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Gold 5 맥주 마시면서 걸어가기
public class Num9205 {
    static int[][] location;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int total = n + 2;
            location = new int[total][2];
            for (int j = 0; j < total; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                location[j][0] = Integer.parseInt(st.nextToken());
                location[j][1] = Integer.parseInt(st.nextToken());
            }

            visited = new boolean[total];
            BFS(0, total);
        }
    }
    private static void BFS(int start, int total) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 0; i < total; i++) {
                if(!visited[i] && distance(location[cur], location[i]) <= 1000) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println(visited[total - 1] ? "happy" : "sad");
    }
    private static int distance(int[] a, int[] b) {
        return Math.abs(a[0] - b[0]) + Math.abs((a[1] - b[1]));
    }
}
