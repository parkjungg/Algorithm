package Bronze;

import java.util.Scanner;

// Bronze 1 달팽이
public class Num2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // A 미터 올라감
        int B = sc.nextInt(); // B 미터 미끄러짐
        int V = sc.nextInt(); // 정상 V 미터

        int day = (V - B) / (A - B);
        if((V - B) % (A - B) != 0) {
            day++;
        }
        System.out.println(day);
        sc.close();
    }
}
