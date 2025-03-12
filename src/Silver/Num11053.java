package Silver;


import java.util.Arrays;
import java.util.Scanner;

// Silver 2 가장 긴 증가하는 부분 수열
public class Num11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] dp = new int[N];
        int length = 1;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            length = Math.max(length, dp[i]);
        }
        System.out.println(length);
        sc.close();
    }
}
