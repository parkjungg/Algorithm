package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 2 마인크래프트
public class Num18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        int[][] ground = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
                minHeight = Math.min(minHeight, ground[i][j]);
                maxHeight = Math.max(maxHeight, ground[i][j]);
            }
        }

        int leastTime = Integer.MAX_VALUE;
        int resultHeight = 0;

        for (int h = minHeight; h <= maxHeight ; h++) {
            int removeBlocks = 0; // 제거할 블록 수
            int addBlocks = 0; // 추가할 블록 수

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = ground[i][j] - h;
                    if(diff > 0) {
                        removeBlocks += diff;
                    } else {
                        addBlocks -= diff;
                    }
                }
            }
            if(removeBlocks + B < addBlocks) {
                continue;
            }

            int time = (removeBlocks * 2) + (addBlocks * 1);
            if(time < leastTime || (time == leastTime && h > resultHeight)) {
                leastTime = time;
                resultHeight = h;
            }
        }
        System.out.println(leastTime + " " + resultHeight);
    }
}
