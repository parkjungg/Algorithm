package Silver;

import java.io.*;
import java.util.Stack;


// Silver 4 균형잡힌 세상
public class Num4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String word = br.readLine();
            if(word.equals(".")) break;
            if(checkBalance(word)) {
                bw.write("yes\n");
                bw.flush();
            }
            else {
                bw.write("no\n");
                bw.flush();
            }
        }
    }
    public static boolean checkBalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (char a : str.toCharArray()) {
            if(a == '(' || a == '[') {
                stack.push(a);
            } else if (a == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (a == ']') {
                if(stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
