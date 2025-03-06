package Silver;

import java.util.Scanner;
import java.util.Stack;

// 스택을 이용하여 구현
// Silver 4
public class Num9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String data = sc.next();
            Stack<Character> stackCharacter = new Stack<>();
            boolean emptyState = true;

            for(char c : data.toCharArray()) {
                if (c == '(') {
                    stackCharacter.push(c);
                } else if (c == ')') {
                    if(stackCharacter.isEmpty()) {
                        emptyState = false;
                        break;
                    }
                    stackCharacter.pop();
                }
            }
            if(emptyState && stackCharacter.isEmpty()) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}
