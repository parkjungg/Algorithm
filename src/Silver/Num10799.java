package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Silver 2 쇠막대기
public class Num10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(c == '(') {
                stack.push(c);
            }
            else if(c == ')') {
                stack.pop();
                if(S.charAt(i -1) == '(') {
                    count += stack.size();
                } else count++;
            }
        }
        System.out.println(count);
    }
}
