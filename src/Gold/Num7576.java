package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// Gold 5 토마토
public class Num7576 {
    static int M,N;
    static int[][] box;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        BFS();
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result, box[i][j]);
            }
        }
        System.out.println(result - 1);
    }

    private static void BFS() {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < N && ny >= 0 && ny < M &&
                        !visited[nx][ny] && box[nx][ny] == 0) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    box[nx][ny] = box[x][y] + 1;
                }
            }
        }
    }
}
