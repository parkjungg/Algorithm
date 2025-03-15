package Bronze;


import java.util.Scanner;

// Bronze 3 웰컴 키트
public class Num30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 6; i++) {
            count += (arr[i] + T - 1) / T; // 수학에서 올림 표현(T - 1)
        }
        System.out.println(count);

        int penNum = N / P;
        int last = N % P;

        System.out.println(penNum + " " + last);
    }
}
