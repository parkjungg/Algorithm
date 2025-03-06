package Bronze;

import java.util.Scanner;

// Bronze 2
public class Num2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            String s = sc.next();
            for (char c : s.toCharArray()) {
                for (int j = 0; j < num; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
