package Silver;


import java.util.LinkedList;
import java.util.Scanner;

// Silver 3 회전하는 큐
public class Num1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int target_idx = deque.indexOf(arr[i]);
            int half_idx = deque.size() / 2;

            if(target_idx <= half_idx) {
                for (int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.addLast(temp);
                    count++;
                }
            }
            else {
                for (int j = 0; j < deque.size() - target_idx; j++) {
                    int temp = deque.pollLast();
                    deque.addFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
        sc.close();
    }
}

// 1 2 3 4 5 6 7 8 9 10