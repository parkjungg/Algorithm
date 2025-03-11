package Silver;


import java.util.Scanner;

// Silver 3 N과 M(4)
public class Num15652 {
    static int N,M;
    static int[] squence;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        squence = new int[M];

        backTracking(1,0);
        sc.close();
    }

    private static void backTracking(int start, int depth) {
        if(depth == M) {
            for (int num : squence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= N; i++) {
            squence[depth] = i;
            backTracking(i, depth + 1);
        }
    }
}
