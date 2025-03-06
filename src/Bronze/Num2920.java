package Bronze;

import java.util.Scanner;

// Bronze 2
public class Num2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 8; i++) {
            if(arr[i] > arr[i-1]) {
                isDescending = false; // 오름차순이면 내림차순이 아님
            } else if (arr[i] < arr[i - 1]) {
                isAscending = false; // 내림차순이면 오름차순이 아님
            }
        }
        if(isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        sc.close();
    }
}
