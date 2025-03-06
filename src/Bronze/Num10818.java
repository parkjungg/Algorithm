package Bronze;

import java.util.Scanner;

// Bronze 3
public class Num10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE; // 정수 최소 값 초기화
        int min = Integer.MAX_VALUE; // 정수 최대 값 초기화

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}
