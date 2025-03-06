package Bronze;

import java.util.Scanner;

// Bronze 2 소수 찾기
public class Num1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean result = true; // 소수인 경우 true, 아니면 false

            int num = sc.nextInt();
            if(num == 1) {
                continue; // 1은 소수가 아니므로 통과
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    result = false; // 나누어 떨어지면 소수가 아니므로 false
                    break;
                }
            }
            if(result) {
                count++; // 소수인 경우 값 1 증가
            }
        }
        System.out.println(count);
    }
}
