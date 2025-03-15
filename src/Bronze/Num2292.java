package Bronze;


import java.util.Scanner;

// Bronze 2 벌접
public class Num2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(FindRoom(N));
    }
    private static int FindRoom(int N) {
        if(N == 1) return 1;

        int start = 2;
        int size = 6;
        int index = 2;
        while(N >= start) {
            int end = start + size - 1;
            if(N <= end && N >= start) {
                return index;
            }
            start = end + 1;
            size += 6;
            index++;
        }
        return -1;
    }
}
