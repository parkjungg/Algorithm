package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Silver 3 파도반 수열
public class Num9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[101];
        dp[0] = 1; dp[1] = 1; dp[2] = 1;

        for (int i = 3; i < 100; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N-1]);
        }
    }
}
