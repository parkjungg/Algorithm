package Silver;


import java.util.Arrays;
import java.util.Scanner;

// Silver 3 통계학
public class Num2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // 산술평균 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        System.out.println(Math.round(sum / N));

        // 중앙값
        System.out.println(arr[Math.round(arr.length/2)]);

        // 최빈값
        int count = 0;
        int max = -1;
        int mod = arr[0];
        boolean check = false;

        for (int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            // 최빈값이 존재할 경우
            if(max < count) {
                max = count;
                mod = arr[i];
                check = true;
            }
            else if(max == count && check == true) {
                mod = arr[i];
                check = false;
            }
        }
        System.out.println(mod);

        // 범위
        System.out.println(arr[arr.length -1] - arr[0]);
        sc.close();
    }
}
