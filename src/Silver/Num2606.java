package Silver;

import java.util.*;

public class Num2606 {
    static boolean[] visited; // 각 컴퓨터가 감염되었는지 여부 확인
    static List<Integer>[] network; // 각 컴퓨터와 연결된 다른 컴퓨터들
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0; // 감염된 컴퓨터 수
        int N = sc.nextInt(); // 컴퓨터의 수
        int M = sc.nextInt(); // 연결되어 있는 컴퓨터의 번호 쌍의 수

        network = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            network[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            network[num1].add(num2);
            network[num2].add(num1);
        }
        dfs(1); // 1번 컴퓨터는 항상 감염
        for (int i = 2; i <= N; i++) {
            if (visited[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
    // 깊이 우선 탐색(DFS) - Stack 이용
    public static void dfs(int computer) {
        visited[computer] = true; // 현재 컴퓨터를 감염 처리
        for(int nextComputer : network[computer]) {
            if(!visited[nextComputer]) {
                dfs(nextComputer); // 연결된 컴퓨터가 감염되지 않았다면 재호출
            }
        }
    }
}
