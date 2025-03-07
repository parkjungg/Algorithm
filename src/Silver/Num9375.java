package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// Silver 3 패션왕 신해빈
public class Num9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                map.put(type, map.getOrDefault(type, 0) + 1);
            }
            int result = 1;
            for(int count : map.values()) {
                result *= (count + 1);
            }
            System.out.println(result - 1);
        }
    }
}
