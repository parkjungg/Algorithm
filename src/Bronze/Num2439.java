package Bronze;

import java.util.Scanner;

// Bronze 4 별 찍기
public class Num2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i < N + 1; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
