package Silver;


import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// Silver 4 비밀번호 찾기
public class Num17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            String password = st.nextToken();
            hashMap.put(id, password);
        }
        for (int i = 0; i < M; i++) {
            String key = br.readLine();
            bw.write(hashMap.get(key) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
