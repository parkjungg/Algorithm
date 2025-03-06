package Silver;

import java.util.Scanner;
import java.util.Stack;

// 스택 명령 문제
public class Num10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stackInt = new Stack<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if(command.equals("push")) {
                int num = sc.nextInt();
                stackInt.push(num);
            } else if (command.equals("pop")) {
                if(stackInt.isEmpty()) System.out.println(-1);
                else System.out.println(stackInt.pop());
            } else if (command.equals("size")) {
                System.out.println(stackInt.size());
            } else if (command.equals("empty")) {
                if(stackInt.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            else if(command.equals("top")) {
                if(stackInt.isEmpty()) System.out.println(-1);
                else System.out.println(stackInt.peek()); // 맨 위의 값을 리턴
            }
        }
        sc.close();
    }
}
