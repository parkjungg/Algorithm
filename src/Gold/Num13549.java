package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Gold 5 숨바꼭질 3
public class Num13549 {
    static int N,K;
    static int MAX = 100001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int result = BFS(N,K);
        System.out.println(result);
    }
    private static int BFS(int start, int end) {
        int[] time = new int[MAX];
        boolean[] visited = new boolean[MAX];
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(start);
        visited[start] = true;

        while(!deque.isEmpty()) {
            int cur = deque.poll();

            if(cur == end) return time[cur];

            if(cur * 2 < MAX && !visited[cur * 2]) {
                deque.offerFirst(cur * 2);
                visited[cur * 2] = true;
                time[cur * 2] = time[cur];
            }

            if(cur - 1 >= 0 && !visited[cur - 1]) {
                deque.offerLast(cur - 1);
                visited[cur - 1] = true;
                time[cur - 1] = time[cur] + 1;
            }

            if(cur + 1 < MAX && !visited[cur + 1]) {
                deque.offerLast(cur + 1);
                visited[cur + 1] = true;
                time[cur + 1] = time[cur] + 1;
            }
        }
        return -1;
    }
}
