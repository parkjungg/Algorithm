package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 RGB거리
public class Num1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] color = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            color[i][0] = Integer.parseInt(st.nextToken());
            color[i][1] = Integer.parseInt(st.nextToken());
            color[i][2] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = color[0][0];
        dp[0][1] = color[0][1];
        dp[0][2] = color[0][2];

        for (int i = 1; i < N; i++) {
            // i번째 집을 빨강으로 칠했을 때 최소비용 = 이전 집을 초록/파랑으로 칠한 경우 중 최소 + 현재 빨강 비용
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + color[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + color[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + color[i][2];
        }
        int result = Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2])); // 마지막집을 빨강/초록/파랑으로 칠했을때 최소값
        System.out.println(result);
    }
}
