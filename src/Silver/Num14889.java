package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 스타트와 링크
public class Num14889 {
    static int N;
    static int[][] stat;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        stat = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                stat[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited[0] = true;
        backTraking(1,1);
        System.out.println(min);
    }
    private static void backTraking(int idx, int depth) {
        if(depth == N / 2) {
            calc();
            return;
        }
        for (int i = idx; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                backTraking(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }
    private static void calc() {
        int teamA = 0;
        int teamB = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(visited[i] && visited[j]) {
                    teamA += stat[i][j] + stat[j][i];
                } else if (!visited[i] && !visited[j]) {
                    teamB += stat[i][j] + stat[j][i];
                }
            }
        }
        int diff = Math.abs(teamA - teamB);
        min = Math.min(min, diff);
    }
}
