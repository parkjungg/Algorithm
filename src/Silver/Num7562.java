package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Silver 1 나이트의 이동
public class Num7562 {
    static int l, curX, curY, fuX, fuY;
    static boolean[][] visited;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            l = Integer.parseInt(br.readLine());
            visited = new boolean[l][l];

            StringTokenizer st = new StringTokenizer(br.readLine());
            curX = Integer.parseInt(st.nextToken());
            curY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            fuX = Integer.parseInt(st.nextToken());
            fuY = Integer.parseInt(st.nextToken());

            int result = BFS(curX, curY);
            System.out.println(result);
        }
    }
    private static int BFS(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];

            if(x == fuX && y == fuY) {
                return count;
            }
            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && ny >= 0 && nx < l && ny < l && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, count + 1});
                }
            }
        }
        return -1;
    }
}
