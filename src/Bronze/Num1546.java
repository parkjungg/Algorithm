package Bronze;

import java.util.Scanner;

public class Num1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        float x = 0; // 최대값 저장
        float avg, sum = 0; // 평균값, 합 저장
        float score[] = new float[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(score[i] > x) {
                x = score[i];
            }
        }
        for (int i = 0; i < n; i++) {
            score[i] = score[i] / x * 100;
        }
        for (int i = 0; i < n ; i++) {
            sum += score[i];
        }
        avg = sum / n;
        System.out.println(avg);
        sc.close();
    }
}