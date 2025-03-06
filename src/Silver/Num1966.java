package Silver;

import java.util.*;

// Silver 3 프린터 큐
public class Num1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < N; i++) {
            int n = sc.nextInt(); // 문서의 개수
            int m = sc.nextInt(); // 알고싶은 문서 n번째

            Queue<Document> queue = new LinkedList<>();
            // 우선순위 큐는 기본적으로 오름차순 정렬
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순으로 정렬

            for (int j = 0; j < n; j++) {
                int importance = sc.nextInt();
                queue.add(new Document(j, importance)); // 문서 저장
                priorityQueue.add(importance); // 문서의 중요도 저장
            }
            int printOrder = 0; // 출력 순서
            // 4 3 2 1  /// 1 2 3 4
            while (!queue.isEmpty()) {
                Document current = queue.poll(); // 큐의 첫번째 문서
                if(current.importance == priorityQueue.peek()) {
                    printOrder++;
                    priorityQueue.poll();
                    if(current.position == m) {
                        System.out.println(printOrder);
                        break;
                    }
                } else {
                    queue.add(current); // 중요도가 가장 높지 않으면 문서를 큐의 뒤로 보냄
                }
            }
        }
        sc.close();
    }
}
class Document {
    int position; // 문서 위치
    int importance; // 문서의 중요도

    public Document(int position, int importance) {
        this.position = position;
        this.importance = importance;
    }
}
