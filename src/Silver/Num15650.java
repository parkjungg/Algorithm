package Silver;


import java.util.Scanner;

// Silver 3 N과 M
public class Num15650 {
    static int N,M;
    static int[] sequence;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];
        backTracking(1,0);
        sc.close();
    }

    // 백트랙킹 기법을 이용해 해결(재귀)
    private static void backTracking(int start, int depth) {
        if(depth == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N ; i++) {
            sequence[depth] = i;
            backTracking(i+1, depth + 1); // 3 2
        }
    }
}
