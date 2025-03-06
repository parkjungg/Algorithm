package Silver;

import java.util.Scanner;

// DP, Greedy
public class Num2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N % 5 == 0) { // 5로만 나누어질때
            System.out.println(N / 5);
        }
        else if(N == 4 || N == 7) {
            System.out.println(-1);
        } else if (N % 5 == 1 || N % 5 == 3) { // 6, 8, 11 ...
            System.out.println((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) { // 9, 12, 14 ...
            System.out.println((N / 5) + 2);
        }
        sc.close();
    }
}