package Silver;


import java.util.Scanner;
import java.util.Stack;

// Silver 2 헌내기는 친구가 필요해
public class Num21736 {
    static boolean[][] visited;
    static char[][] room;
    static int N, M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        room = new char[N][M];
        visited = new boolean[N][M];
        int currentX = -1;
        int currentY = -1;
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                room[i][j] = line.charAt(j);
                if (room[i][j] == 'I') {
                    currentX = i;
                    currentY = j;
                }
            }
        }
        int result = DFS(currentX, currentY);
        System.out.println(result > 0 ? result : "TT");
    }

    private static int DFS(int startX, int startY) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});
        visited[startX][startY] = true;

        int count = 0;
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            if (room[x][y] == 'P') count++;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && room[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
        return count;
    }
}
