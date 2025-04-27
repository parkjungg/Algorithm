package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

// Gold 5 AC
public class Num5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Deque<Integer> deque = new ArrayDeque<>();
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();

            arr = arr.replace("[", "").replace("]", "");
            if(!arr.isEmpty()) {
                String[] tokens = arr.split(",");
                for (String token : tokens) {
                    deque.addLast(Integer.parseInt(token.trim()));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char c : p.toCharArray()) {
                if(c == 'R') {
                    isReversed = !isReversed;
                } else if (c == 'D') {
                    if(deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if(isReversed) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }

            if(isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    if(isReversed) {
                        sb.append(deque.removeLast());
                    } else {
                        sb.append(deque.removeFirst());
                    }
                    if(!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}
