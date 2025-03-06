package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Silver 4 큐
// offer 메서드는 큐가 가득차면 false 반환, add 메서드는 큐가 가득차면 예외 발생
public class Num10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int lastAdd = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if(command.equals("push")) {
                int num = sc.nextInt();
                lastAdd = num;
                queue.add(num);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.poll());
            } else if (command.equals("size")) {
                System.out.println(queue.size());
            } else if (command.equals("empty")) {
                if(queue.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (command.equals("front")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(queue.peek());
            } else if (command.equals("back")) {
                if (queue.isEmpty()) System.out.println(-1);
                else System.out.println(lastAdd);
            }
        }
        sc.close();
    }
}
