package Silver;


import java.util.Scanner;

// Silver 1 오르막 수
public class Num11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int MOD = 10007;
        int[] dp = new int[10];

        for (int i = 0; i < 10; i++) {
            dp[i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < 10; j++) {
                dp[j] = (dp[j] + dp[j - 1]) % MOD;
            }
        }

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            ans = (dp[i] + ans) % MOD;
        }
        System.out.println(ans);
    }
}
