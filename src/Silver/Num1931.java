package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Silver 1
public class Num1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] time = new int[N][2]; // 2차원 배열 선언

        for (int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) { // 종료시간이 같을 경우 시작이 더 빠른 순으로 정렬
                    return o1[0] - o2[0]; // o1[0] 이 o2[0]보다 작으면 음수, 크면 양수, 같으면 0을 반환
                }
                return o1[1] - o2[1]; // 종료시간이 같지 않을 경우 종료시간이 더 빠른 것부터 정렬
            }
        });

        int count = 0;
        int prev_time = 0;

        for (int i = 0; i < N; i++) {
            if(prev_time <= time[i][0]) {
                prev_time = time[i][1];
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

// 회의가 가장 빨리 끝나는 것부터 회의 시간표에 넣으면 된다.