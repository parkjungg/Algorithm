package Silver;


import java.io.*;
import java.util.Scanner;

// Silver 3 피보나치 함수
public class Num1003 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] dp = new int[41][2]; // dp[a][b] 에서 b는 0 또는 1의 개수
        dp[0][0] = 1; dp[0][1] = 0; // fibo 0은 0이 1번, 1이 0번 출력
        dp[1][0] = 0; dp[1][1] = 1; // fibo 1은 0이 0번, 1이 1번 출력

        // dp 배열 채우기
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N][0] + " " + dp[N][1] + "\n");
            bw.flush();
        }
        bw.close();
    }

}
