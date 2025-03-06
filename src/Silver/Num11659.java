package Silver;


import java.io.*;

// Silver 3 구간 합 구하기 4
public class Num11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        String[] arr = br.readLine().split(" "); // 수 N개
        int[] prefixSum = new int[N + 1]; // 누적합 배열

        // 누적 합 계산
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i-1] + Integer.parseInt(arr[i-1]);
        }

        // 구간 합 계산
        for (int i = 0; i < M; i++) {
            String[] num2 = br.readLine().split(" ");
            int k = Integer.parseInt(num2[0]);
            int p = Integer.parseInt(num2[1]);

            sum = prefixSum[p] - prefixSum[k - 1];
            bw.write(sum + "\n");
            bw.flush();
        }
        bw.close();
    }
}
