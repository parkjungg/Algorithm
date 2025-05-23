package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 연산자 끼워넣기
public class Num14888 {
    static int[] num;
    static int[] op = new int[4];
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        num = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        BackTracking(1, num[0]);
        System.out.println(max);
        System.out.println(min);

    }
    private static void BackTracking(int idx, int result) {
        if(idx == N) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if(op[i] > 0) {
                op[i]--;
                int newResult = calc(result, num[idx], i);
                BackTracking(idx + 1, newResult);
                op[i]++;
            }
        }
    }
    private static int calc(int a, int b, int op) {
        switch (op) {
            case 0: return a + b;
            case 1: return a - b;
            case 2: return a * b;
            case 3:
                if(a < 0) return -(-a / b);
                else return a / b;
        }
        return 0;
    }
}
