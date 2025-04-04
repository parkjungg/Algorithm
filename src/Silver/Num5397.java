package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Silver 2 키로거
public class Num5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c == '<') {
                    if(!leftStack.isEmpty()) {
                        rightStack.push(leftStack.pop());
                    }
                } else if (c == '>') {
                    if(!rightStack.isEmpty()) {
                        leftStack.push(rightStack.pop());
                    }
                    ;
                } else if (c == '-') {
                    if(!leftStack.isEmpty()) {
                        leftStack.pop();
                    }
                } else {
                    leftStack.push(c);
                }
            }
            while(!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
            while(!rightStack.isEmpty()) {
                sb.append(rightStack.pop());
            }
            System.out.println(sb);
        }
    }
}
