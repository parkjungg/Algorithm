package Silver;


import java.util.Scanner;

// Silver 2 색종이 만들기
public class Num2630 {
    static int[][] arr;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        partition(0,0, N);
        System.out.println(white);
        System.out.println(blue);
    }
    public static void partition(int row, int col, int size) {
        if(checkColor(row, col, size)) {
            if(arr[row][col] == 0) {
                white++;
            }
            else {
                blue++;
            }
            return;
        }
        int newSize = size / 2;
        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize, col + newSize, newSize);
    }
    public static boolean checkColor(int row, int col, int size) {
        int color = arr[row][col];

        for (int i = row; i < row + size ; i++) {
            for (int j = col; j < col + size; j++) {
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
