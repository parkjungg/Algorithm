package Bronze;

import java.util.Scanner;

// Bronze 4
public class Num11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();

        for(char c : num.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}
