package Bronze;


import java.io.*;

// Bronze 1 부녀회장이 될테야
public class Num2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j]; // 2 3  2 2 + 1 3
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(dp[k][n]);
        }
    }
}

// 1층 1호 - 1명           2층 1호 - 1명          3층 1호 - 1명
// 1층 2호 - 3명           2층 2호 - 4명          3층 2호 - 5명
// 1층 3호 - 6명 ...       2층 3호 - 10명 ...      3층 3호 - 15명 ...
// 1층 4호 - 10명