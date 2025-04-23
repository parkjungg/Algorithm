package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


// Silver 1 안전 영역
public class Num2468 {
    static int N;
    static int[][] pos;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0 ,0};
    static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        pos = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                pos[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                max = Math.max(max, pos[i][j]);
            }
        }

        int count = 0;
        for (int i = 0; i <= max; i++) {
            visited = new boolean[N][N];
            int safeCount = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(!visited[j][k] && pos[j][k] > i) {
                        DFS(j, k, i);
                        safeCount++;
                    }
                }
            }
            count = Math.max(count, safeCount);
        }
        System.out.println(count);
    }

    private static void DFS(int x, int y, int height) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while(!stack.isEmpty()) {
            int[] current = stack.pop();
            int cx = current[0];
            int cy = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && pos[nx][ny] > height) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }
}
