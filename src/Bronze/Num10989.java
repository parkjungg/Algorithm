package Bronze;

import java.io.*;

// Bronze 1 수 정렬하기
public class Num10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] count = new int[10001];
        int[] result = new int[N];

        // arr에 모든 값 입력받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // arr를 한번 순회하면서 해당 값을 index로 하는 배열에 값을 삽입
        for (int i = 0; i < N; i++) {
            count[arr[i]]++;
        }
        // 누적합으로 변환
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        // 계수 정렬
        for (int i = N - 1; i >= 0 ; i--) {
            int a = arr[i];
            count[a]--;
            result[count[a]] = a;
        }
        // 오름차순 출력
        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(result[i]) + "\n");
        }
        bw.flush();
    }
}
