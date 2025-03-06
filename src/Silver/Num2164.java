package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Silver 4 카드2
public class Num2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while(queue.size() != 1) {
            queue.poll(); // 제일 위의 카드를 하나 버림
            int recycle = queue.poll();
            queue.offer(recycle);
        }
        System.out.println(queue.poll());
        sc.close();
    }
}
