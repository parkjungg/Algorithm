package Silver;


import java.util.Arrays;
import java.util.Scanner;

// Silver 3 N과 M(5)
public class Num15654 {
    static int N,M;
    static int[] sequence;
    static int[] numbers;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];
        numbers = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        backTracking(0);
        sc.close();
    }
    private static void backTracking(int depth) {
        if(depth == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                sequence[depth] = numbers[i];
                backTracking(depth + 1);
                visited[i] = false;
            }
        }
    }
}
