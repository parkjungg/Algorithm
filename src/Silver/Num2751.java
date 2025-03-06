package Silver;

import java.io.*;
import java.util.Arrays;

// Silver 5 수 정렬하기
public class Num2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int num : arr) {
            bw.write(num + "\n");
        }

        bw.flush(); // 출력 버퍼 비우기
        br.close();
        bw.close();
    }
}
