package Bronze;


import java.util.Scanner;

// Bronze 1 팰린드롬수
public class Num1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();
            String s = String.valueOf(num);
            int count = 0;
            if(num == 0) break;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                    count++;
                }
            }
            if(count == s.length()){
                System.out.println("yes");
            } else System.out.println("no");
        }
    }
}