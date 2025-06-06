package Silver;


import java.util.Scanner;

// Silver 3  2xn 타일링
public class Num11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n + 2];

        dp[1] = 1;
        if(n > 1) dp[2] = 2;    // 불필요한 연산 방지

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        System.out.println(dp[n]);


    }
}
