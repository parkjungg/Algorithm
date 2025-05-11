package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Gold 5 하노이 탑 이동 순서
public class Num11729 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3, 2);
        System.out.println(count);
        System.out.println(sb);
    }
    static void hanoi(int n, int from, int to, int via) {
        if(n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }
        hanoi(n - 1, from, via, to);
        sb.append(from).append(" ").append(to).append("\n");
        count++;
        hanoi(n - 1, via, to, from);
    }
}
