package Bronze;


import java.util.Scanner;

// Bronze 4  A + B - C
public class Num31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A+B-C);

        String result1 = addString(A,B);
        int result2 = subString(result1, C);

        System.out.println(result2);
    }
    private static String addString(int first, int second) {
        String firstStr = String.valueOf(first);
        String secondStr = String.valueOf(second);

        String s = firstStr + secondStr;
        return s;
    }
    private static int subString(String first, int second) {
        int n = Integer.parseInt(first);
        int result = n - second;
        return result;
    }
}
