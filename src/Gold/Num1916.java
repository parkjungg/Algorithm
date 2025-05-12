package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Gold 5 최소비용 구하기
public class Num1916 {
    static int N,M;
    static List<List<int[]>> graph = new ArrayList<>();
    static int[] distance;
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N ; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(A).add(new int[]{B, cost});
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int result = Dijkstra(start, end);

        System.out.println(result);
    }
    private static int Dijkstra(int start, int dest) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        distance = new int[N + 1];
        Arrays.fill(distance, INF);
        distance[start] = 0;

        pq.offer(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int cur = now[0];
            int curCost = now[1];

            if(distance[cur] < curCost) continue;

            for(int[] next : graph.get(cur)) {
                int nextNode = next[0];
                int nextCost = next[1];

                if(distance[nextNode] > curCost + nextCost) {
                    distance[nextNode] = curCost + nextCost;
                    pq.offer(new int[]{nextNode, distance[nextNode]});
                }
            }
        }
        return distance[dest];
    }
}
