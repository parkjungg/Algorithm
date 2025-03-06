package Silver;

import java.io.*;
import java.util.Arrays;

// Silver 4 수 찾기
public class Num1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr1[] = new int[N];
        // BufferedReader를 사용할때, 공백으로 구분된 경우 readLine()이 한 줄 전체를 읽어오기 때문에
        // 공백이 있는 문자열은 정수로 변환하지 못해 오류 발생 가능 → split() 이용하여 문자열을 나눔
        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int M = Integer.parseInt(br.readLine());
        int arr2[] = new int[M];
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(arr1); // arr1 배열 정렬
        for (int i = 0; i < M; i++) {
            int result = BinarySearch(arr1, arr2[i]);
            bw.write(result + "\n");
        }
        bw.flush(); // 버퍼에 있는 출력을 내보냄
        bw.close();
    }
    // 이진 탐색을 이용해 수 탐색 판별
    public static int BinarySearch(int[] arr, int n) {
        int left = 0; // 왼쪽 끝
        int right = arr.length - 1; // 오른쪽 끝
        int mid; // 중간값
        while (left <= right) {
            mid = (left+right) / 2; // 중간값 정의
            if(arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return 1; // arr[mid] == n 일때
        }
        return 0;
    }
}
