package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// Silver 2 에디터
public class Num1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (char c : S.toCharArray()) {
            leftStack.push(c);
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);

            if(command == 'P') {
                char a = st.nextToken().charAt(0);
                leftStack.push(a);
            } else if(command == 'L') {
                if(!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
            } else if (command == 'D') {
                if(!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
            } else if(command == 'B') {
                if(!leftStack.isEmpty()) {
                    leftStack.pop();
                }
            }
        }
        while (!leftStack.isEmpty()) {
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
    }
}
