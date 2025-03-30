package Silver;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Silver 3 풍선 터뜨리기
public class Num2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<int[]> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.add(new int[]{i, sc.nextInt()});
        }
        int num = 0;

        while (!deque.isEmpty()) {
            if(num > 0) {
                for (int i = 0; i < num - 1; i++) {
                    deque.add(deque.poll());
                }
            } else {
                for (int i = 0; i < -num; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }

            int[] current = deque.pollFirst();
            sb.append(current[0]).append(" ");
            num = current[1];
        }
        System.out.println(sb);
    }
}
