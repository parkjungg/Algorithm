package Bronze;


import java.util.Scanner;

// Bronze 2 Hashing
public class Num15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String s = sc.next();
        long mod = 1234567891;
        long hash = 0;
        long power = 1;

        for (int i = 0; i < L; i++) {
            int current = s.charAt(i) - 96;
            hash = (hash + (current * power) % mod) % mod;
            power = (power * 31) % mod;
        }
        System.out.println(hash);
    }
}
