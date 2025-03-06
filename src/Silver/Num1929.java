package Silver;

import java.util.Scanner;

// 소수 구하기
public class Num1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i = M; i <= N ; i++) {
            if(i == 1) continue;
            boolean isPrime = true;
            for (int j = 2; j*j <= i ; j++) {
                if(i % j == 0) {
                    isPrime = false; // 소수가 아님을 판단
                    break;
                }
            }
            if(isPrime) System.out.println(i);
        }
        sc.close();
    }
}

// 소수 * 소수가 출력되는 문제
// 소수 * 소수는 소수가 아님