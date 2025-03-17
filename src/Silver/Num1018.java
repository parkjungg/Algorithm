package Silver;


import java.util.Scanner;

// Silver 4 체스판 다시 칠하기
public class Num1018 {
    static char[][] chessBoard;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        chessBoard = new char[N][M];

        for (int i = 0; i < N; i++) {
            chessBoard[i] = sc.next().toCharArray();
        }
        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8 ; j++) {
                minPaint = Math.min(minPaint, calculateCount(i,j));
            }
        }
        System.out.println(minPaint);
    }
    public static int calculateCount(int x, int y) {
        int whiteStart = 0;
        int blackStart = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectWhiteStart = ((i+j) % 2 == 0) ? 'W' : 'B';
                char expectBlackStart = ((i+j) % 2 == 0) ? 'B' : 'W';

                if(chessBoard[x+i][y+j] != expectWhiteStart) {
                    whiteStart++;
                }
                if(chessBoard[x+i][y+j] != expectBlackStart) {
                    blackStart++;
                }
            }
        }
        return Math.min(whiteStart, blackStart);
    }

}
