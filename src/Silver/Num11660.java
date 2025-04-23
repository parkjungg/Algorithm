package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 구간 합 구하기 5
public class Num11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        int[][] sum = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
                // (i,j) 까지의 누적합 = 현재값 + 왼쪽 누적합 + 위쪽 누적합 - 중복된 겹친 영역 누적합
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            // (1,1) 부터 (x2,y2) 까지의 전체 합 - 위쪽 - 왼쪽 + 중복해서 뺀 영역을 한번 다시 더함
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}

  /*       1  2  3
        1 [x][x][x]
        2 [x][3][4]
        3 [x][5][6] */