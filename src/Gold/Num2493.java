package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<int[]> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int height = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty() && stack.peek()[0] < height) {
                stack.pop();
            }

            if(!stack.isEmpty()) {
                result[i] = stack.peek()[1] + 1;
            }
            stack.push(new int[]{height, i});
        }

        for (int res : result) {
            System.out.print(res + " ");
        }
    }
}
