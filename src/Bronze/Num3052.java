package Bronze;

import java.util.HashSet;
import java.util.Scanner;

// Bronze 2
public class Num3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int N = sc.nextInt();
            set.add(N % 42);
        }
        System.out.println(set.size());
        sc.close();
    }
}
