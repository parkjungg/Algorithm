package Bronze;

import java.util.Scanner;

// Bronze 2
public class Num8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int result = 0;  // 최종 결과
            int sum = 1; // X가 나오기전까지의 합
            String ox = sc.next();
            for (char c : ox.toCharArray()) {
                if(c == 'O') {
                    result += sum;
                    sum++;
                } else if (c == 'X') {
                    sum = 1;
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}
