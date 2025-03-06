package Bronze;

import java.util.Scanner;

// Bronze 2 알파벳 찾기
public class Num10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(s.indexOf(c));
            c = (char)(c + 1);
        }
        sc.close();
    }
}
