package Silver;


import java.util.Scanner;

// Silver 3 이친수
public class Num2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] dp = new long[N+1];
        if(N > 2) {
            dp[1] = 1;
            dp[2] = 1;
        }
        else {
            System.out.println(1);
            return;
        }
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.println(dp[N]);

    }
}

// N = 1, 1     1
// N = 2, 10    1
// N = 3, 100, 101   2
// N = 4, 1000, 1010, 100  3
// N = 5, 10000, 10101, 10010, 10001, 10100   5 ...