package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 2 예산
public class Num2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] account = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            account[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, account[i]);
        }

        int M = Integer.parseInt(br.readLine());

        int left = 0;
        int right = max;
        int result = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            long money = getMaxMoney(account, mid);
            if(money <= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
    private static long getMaxMoney(int[] account, int mid) {
        long total = 0;
        for (int money : account) {
            total += Math.min(money, mid);
        }
        return total;
    }

}
