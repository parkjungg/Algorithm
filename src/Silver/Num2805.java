package Silver;


import java.io.*;
import java.util.StringTokenizer;

// Silver 2 나무 자르기
public class Num2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, tree[i]);
        }
        int left = 0;
        int right = max;
        int result = 0;

        // 이분 탐색을 통한 최대의 절단기 높이 구하기
        while (left <= right) {
            int mid = (left + right) / 2;
            long wood = getWood(tree, mid);

            if(wood >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }

    private static long getWood(int[] trees, int mid) {
        long total = 0;
        for (int tree : trees) {
            if(tree > mid) {
                total += (tree - mid);
            }
        }
        return total;
    }
}
