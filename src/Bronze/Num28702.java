package Bronze;


import java.util.Scanner;

// Bronze 1 FizzBuzz
public class Num28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];

        for (int i = 0; i < 3; i++) {
            s[i] = sc.nextLine();
        }
        boolean n1 = checkNum(s[0]);
        boolean n2 = checkNum(s[1]);
        boolean n3 = checkNum(s[2]);

        if(n1) {
            int number = Integer.parseInt(s[0]);
            number += 3;
            checkFizzBuzz(number);
        } else if (n2) {
            int number = Integer.parseInt(s[1]);
            number += 2;
            checkFizzBuzz(number);
        } else if (n3) {
            int number = Integer.parseInt(s[2]);
            number += 1;
            checkFizzBuzz(number);
        }
    }
    private static boolean checkNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static void checkFizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else System.out.println(num);
    }
}
