package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

// Gold 4 이중 우선순위 큐
public class Num7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            TreeMap<Integer, Integer>  map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char command = st.nextToken().charAt(0);
                int num = Integer.parseInt(st.nextToken());

                if(command == 'I') {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                } else if (command == 'D') {
                    if (map.isEmpty()) continue;

                    int key = (num == 1) ? map.lastKey() : map.firstKey();
                    if (map.get(key) == 1) {
                        map.remove(key);
                    } else {
                        map.put(key, map.get(key) - 1);
                    }
                }
            }
            if(map.isEmpty()) {
                System.out.println("EMPTY");
            }
            else {
                System.out.println(map.lastKey() + " " + map.firstKey());
            }
        }
    }
}
