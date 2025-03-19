package Silver;


import java.io.*;
import java.util.Arrays;

// Silver 4 solved.ac
public class Num18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = Math.round(n / 100.0f * 15);
        float sum = 0;
        float divide = n - num * 2;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            arr[i] = 0;
        }
        for (int i = n - 1; i > n - num - 1; i--) {
            arr[i] = 0;
        }

        for (int a : arr) {
            sum += a;
        }
        System.out.println(Math.round(sum / divide));
    }
}
