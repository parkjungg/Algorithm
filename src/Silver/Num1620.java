package Silver;


import java.io.*;
import java.util.*;

// Silver 4 나는야 포켓몬 마스터 이다솜
public class Num1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>(N + 1);
        list.add("");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            list.add(name);
            map.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if(Character.isDigit(query.charAt(0))) {
                int index = Integer.parseInt(query);
                bw.write(list.get(index) + "\n");
            }
            else {
                bw.write(map.get(query) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
