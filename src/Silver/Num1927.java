package Silver;

import java.io.*;
import java.util.PriorityQueue;

// Silver 2 최소 힙
public class Num1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선 순위 큐 이용(오름차순 출력)
        // new PriorityQueue<>(Collections.reverseOrder()) → 내림차순 출력
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x > 0) {
                priorityQueue.add(x);
            }
            else if (x == 0) {
                if (!priorityQueue.isEmpty()) {
                    bw.write(priorityQueue.poll() + "\n"); // 작은 숫자부터 출력
                    bw.flush();
                }
                else System.out.println(0);

            }
        }
        bw.close();
    }

}
