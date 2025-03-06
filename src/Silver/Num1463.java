package Silver;

import java.util.Scanner;

// Silver3
public class Num1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dp[] = new int[N + 1]; // 연산의 최솟값을 저장하는 배열
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + 1; // 1을 빼줌
            if(i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1); // 1을 뺀 값과 2로 나눈 값
            if(i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1); // 1을 뺀 값과 3으로 나눈 값
        }
        System.out.println(dp[N]);
        sc.close();
    }
}