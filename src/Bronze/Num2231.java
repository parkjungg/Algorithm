package Bronze;


import java.util.Scanner;

// Bronze 2 분해합
public class Num2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(Calculate(N));
    }

    private static int Calculate(int N) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            int num = i;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == N) {
                result = i;
                break;
            }
        }
        return result;
    }
}
