package Silver;


import java.util.Scanner;
import java.util.Stack;

// Silver 2 섬의 개수
public class Num4963 {
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    static int w,h;
    static int[][] island;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            island = new int[h][w];
            visited = new boolean[h][w];

            if(w == 0 && h == 0) break;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    island[i][j] = sc.nextInt();
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(!visited[i][j] && island[i][j] == 1) {
                        DFS(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void DFS(int startX, int startY) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});
        visited[startX][startY] = true;

        while(!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < h && ny >= 0 && ny < w && !visited[nx][ny] && island[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }
}
