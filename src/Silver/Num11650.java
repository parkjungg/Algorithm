package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Num11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Position[] pos = new Position[N];
        for (int i = 0; i < N; i++) {
            pos[i] = new Position(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(pos, ((o1, o2) -> {
            if(o1.y == o2.y) {
                return Integer.compare(o1.x, o2.x);
            }
            return Integer.compare(o1.y, o2.y);
        }));
        Arrays.sort(pos, ((o1, o2) -> {
            if(o1.x == o2.x) {
                return Integer.compare(o1.y, o2.y);
            }
            return Integer.compare(o1.x, o2.x);
        }));

        // StringBuilder는 출력할 때 sout 보다 시간을 대폭 줄여줌
        StringBuilder sb = new StringBuilder();
        for (Position position : pos) {
            sb.append(position.x).append(" ").append(position.y).append("\n");
        }
        System.out.println(sb);
//        for(Position position : pos) {
//            System.out.println(position.x + " " + position.y);
//        }
        sc.close();
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
