package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Gold 5 Z
public class Num1074 {
    static int count = 0;
    static int r, c;
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int size = (int)Math.pow(2, N);
        z(0, 0, size);
        System.out.println(result);
    }

    static void z(int row, int col, int size) {
        if(size == 1) {
            if(row == r && col == c) {
                result = count;
            }
            count++;
            return;
        }

        int half = size / 2;

        if(r < row + half && c < col + half) {
            z(row, col, half);
        } else if (r < row + half && c >= col + half) {
            count += half * half;
            z(row, col + half, half);
        } else if (r >= row + half && c < col + half) {
            count += 2 * half * half;
            z(row + half, col, half);
        }
        else {
            count += 3 * half * half;
            z(row + half, col + half, half);
        }
    }
}
