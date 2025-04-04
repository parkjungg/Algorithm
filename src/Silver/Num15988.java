package Silver;


import java.util.Scanner;

// Silver 2 1,2,3 더하기 3
public class Num15988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long[] dp = new long[1000001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}

// 1    1
// 2    1+1    2
// 3    2+1, 1+2, 1+1+1  3 4
// 4    7
// 5    1+1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 2+1+1+1
// 1+1+3, 1+3+1, 3+1+1, 2+2+1, 2+1+2, 1+2+2, 3+2, 2+3
// 13