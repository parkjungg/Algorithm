package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 스티커
public class Num9465 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int k = 0; k < T; k++) {
            int n = Integer.parseInt(br.readLine());
            int[][] sticker = new int[2][n];
            int[][] dp = new int[2][n];

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];
            if(n > 1) {
                dp[0][1] = sticker[0][1] + dp[1][0];
                dp[1][1] = sticker[1][1] + dp[0][0];
            }

            for (int i = 2; i < n; i++) {
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + sticker[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + sticker[1][i];
            }
            System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
        }
    }
}
