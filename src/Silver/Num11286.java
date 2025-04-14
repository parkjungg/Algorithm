package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// Silver 1 절댓값 힙
public class Num11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(
                (a,b) -> {
                    if(Math.abs(a) == Math.abs(b)) {
                        return Integer.compare(a, b);
                    }
                    return Integer.compare(Math.abs(a), Math.abs(b));
                }
        );

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                if(!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                }
                else System.out.println(0);
            }
            else {
                priorityQueue.add(x);
            }
        }
    }
}
