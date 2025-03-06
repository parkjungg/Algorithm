package Bronze;

import java.util.Scanner;

// Bronze 3 ACM 호텔
public class Num10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // H층 호텔
            int W = sc.nextInt(); // 각 층의 W개의 방
            int N = sc.nextInt(); // N 번째 손님

            int floor = (N - 1) % H + 1;
            int room = (N - 1) / H + 1;

            System.out.printf("%d%02d\n", floor, room); // %02d는 방번호가 한자리 일 때 앞에 0을 붙여 두자리로 만듦
        }
        sc.close();
    }
}
