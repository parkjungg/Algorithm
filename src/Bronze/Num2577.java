package Bronze;

import java.util.Scanner;

// Bronze 2
public class Num2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A * B * C;
        String str = Integer.toString(result);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if((str.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
        
        sc.close();
    }
}
