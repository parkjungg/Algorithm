package Bronze;


import java.util.Scanner;

// Bronze 1 이항 계수1
public class Num11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 1;
        int factorial = 1;

        for (int i = 0; i < K; i++) {
            result = result * N;
            N--;
        }

        int a = K;
        for (int i = 0; i < K; i++) {
            factorial = factorial * a;
            a--;
        }
        result = result / factorial;
        System.out.println(result);

        sc.close();
    }
}