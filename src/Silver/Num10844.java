package Silver;


import java.util.Scanner;

// Silver 1 쉬운 계단 수
public class Num10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[][] dp = new long[N + 1][10];
        int MOD = 1_000_000_000;
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            dp[i][0] = dp[i - 1][1] % MOD;
            for (int j = 1; j <= 8; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
            }
            dp[i][9] = dp[i-1][8] % MOD;
        }

        long sum = 0;
        for (int i = 0; i <= 9 ; i++) {
            sum = (sum + dp[N][i]) % MOD;
        }
        System.out.println(sum);
    }
}