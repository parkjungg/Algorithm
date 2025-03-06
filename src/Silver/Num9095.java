package Silver;


import java.io.*;

// Silver 3 1,2,3 더하기
public class Num9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int num = 0;
        int[] dp = new int[11]; // 동적 프로그래밍 이용

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; // 점화식
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[n]) + "\n");
            bw.flush();
        }
    }
}
