package Silver;


import java.util.Scanner;

// Silver 2 이항 계수 2
public class Num11051 {
    static int[][] dp;
    static final int MOD = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        dp = new int[N+1][K+1];
        System.out.println(combination(N, K));
    }
    private static int combination(int n, int k) {
        if(dp[n][k] > 0) return dp[n][k];

        if(k == 0 || n == k) return 1;

        return dp[n][k] = (combination(n-1, k-1) + combination(n - 1, k)) % MOD;
    }
}
