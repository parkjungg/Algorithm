package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Silver 1 IOIOI
public class Num5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        int pattern = 0;

        for (int i = 1; i < M - 1;) {
            if (S.charAt(i - 1) == 'I' && S.charAt(i) == 'O' && S.charAt(i + 1) == 'I') {
                pattern++;
                if(pattern == N) {
                    count++;
                    pattern--;
                }
                i += 2;
            } else {
                pattern = 0;
                i++;
            }
        }
        System.out.println(count);
    }
}
