package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// Silver 2 유기농 배추
public class Num1012 {
    static int M, N, K;
    static boolean[][] field; // 배추밭에 배추 존재 여부
    static boolean[][] visited; // 배추밭 탐색 시 방문 여부
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        while (T > 0) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            // x,y좌표계와 컴퓨터 좌표계(행렬)은 반대
            field = new boolean[N][M]; // 배추 존재 여부
            visited = new boolean[N][M]; // 방문 여부

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                field[Y][X] = true; // 배추밭에 배추 존재 체크
            }
            int count = 0;
            for (int i = 0; i < N; i++) { // 좌표를 돌아다니면서 하나씩 체크
                for (int j = 0; j < M; j++) {
                    if(field[i][j] && !visited[i][j]) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            T--;
            System.out.println(count);
        }
    }

    static void DFS(int y, int x) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{y,x});
        visited[y][x] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int curY = current[0];
            int curX = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && nx < M && ny >= 0 && ny < N) {
                    if(field[ny][nx] && !visited[ny][nx]) {
                        stack.push(new int[]{ny, nx});
                        visited[ny][nx] = true;
                    }
                }
            }

        }
    }
}
