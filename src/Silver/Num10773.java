package Silver;


import java.util.Scanner;
import java.util.Stack;

// Silver 4 제로
public class Num10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num != 0) {
                stack.push(num);
            }
            else {
                stack.pop();
            }
        }
        int sum = 0;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sum += stack.pop();
        }
        System.out.println(sum);
        sc.close();
    }
}
