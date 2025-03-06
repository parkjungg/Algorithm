package Silver;


import java.io.*;
import java.util.Arrays;

// Silver 4 ATM
public class Num11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int a = 0;
        int sum = 0;
        int result = 0;

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
        // 1 2 3 3 4
        for (int i = 0; i < N; i++) {
            sum = a + arr[i];
            a = sum;
            arr[i] = a;
        }

        for (int i = 0; i < N; i++) {
            result += arr[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
