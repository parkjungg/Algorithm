package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

// Silver 1 영역 구하기
public class Num2583 {
    static int M, N, K;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static ArrayList<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[M][N];
        visited = new boolean[M][N];
        result = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int y = y1; y < y2; y++) {
                for (int x = x1; x < x2; x++) {
                    arr[y][x] = 1;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(!visited[i][j] && arr[i][j] == 0) {
                    visited[i][j] = true;
                    DFS(i, j);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int a : result) {
            System.out.print(a + " ");
        }
    }
    private static void DFS(int x, int y) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        int size = 1;

        while(!stack.isEmpty()) {
            int[] current = stack.pop();
            int nx = current[0];
            int ny = current[1];

            for (int i = 0; i < 4; i++) {
                int cx = nx + dx[i];
                int cy = ny + dy[i];
                if(cx >= 0 && cx < M && cy >= 0 && cy < N && !visited[cx][cy] && arr[cx][cy] == 0) {
                    visited[cx][cy] = true;
                    stack.push(new int[]{cx, cy});
                    size++;
                }
            }
        }
        result.add(size);
    }
}
// (0,2) ~ (4,4)
// (0,3) (0,4)