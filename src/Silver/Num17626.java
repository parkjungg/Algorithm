package Silver;


import java.io.*;

// Silver 3 Four Squares
public class Num17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        dp[0] = 0; dp[1] = 1;
        int min = 0;
        for (int i = 2; i <= n; i++) {
            min = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int temp = i - j*j;
                min = Math.min(min, dp[temp]);
            }
            dp[i] = min + 1;
        }
        bw.write(dp[n] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}


// 1 = 1^2, 2 = 1^2 + 1^2, 3 = 1^2 + 1^2 + 1^2, 4 = 2^2
// 5 = 2^2 + 1^2, 6 = 2^2 + 1^2 + 1^2, 7 = 2^2 + 1+ 1+ 1
// 8 = 2^2 + 2^2, 9 = 3^2, 10 = 3^2 + 1, 11 = 3^2 + 1 + 1...

// 1 2 3
// 1 2 3 4
// 2 1 2 3