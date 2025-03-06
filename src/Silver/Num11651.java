package Silver;


import java.io.*;
import java.util.Arrays;

// Silver 5 좌표 정렬하기 2
public class Num11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Position2[] pos = new Position2[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            pos[i] = new Position2(x, y);
        }

        Arrays.sort(pos, ((o1, o2) -> {
            if(o1.y == o2.y) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o1.y, o2.y);
        }));

        for (Position2 position2 : pos) {
            bw.write(position2.x + " " + position2.y + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Position2 {
    int x;
    int y;

    public Position2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}