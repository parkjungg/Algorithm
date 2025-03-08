package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Silver 2 좌표 압축
public class Num18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sortArr = arr.clone(); // 배열 복사
        Arrays.sort(sortArr);

        Map<Integer, Integer> map = new HashMap<>(); // 중복제거
        int index = 0;
        for (int num : sortArr) {
            if(!map.containsKey(num)) {
                map.put(num, index++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}
