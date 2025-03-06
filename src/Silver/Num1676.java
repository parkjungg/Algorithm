package Silver;


import java.io.*;

// Silver 5 팩토리얼 0의 개수
public class Num1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num = 0;

        while(N > 1) {
            num += N / 5;
            N = N / 5;
        }
        bw.write(String.valueOf(num));

        bw.flush();
    }
}
