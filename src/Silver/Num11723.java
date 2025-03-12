package Silver;


import java.io.*;
import java.util.HashSet;

// Silver 5 집합
public class Num11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String[] s = br.readLine().split(" ");
            if (s[0].equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (s[0].equals("empty")) {
                set.clear();
            } else {
                int num = Integer.parseInt(s[1]);
                if(s[0].equals("add")) {
                    set.add(num);
                } else if (s[0].equals("remove")) {
                    set.remove(num);
                } else if (s[0].equals("check")) {
                    if (set.contains(num)) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                } else if (s[0].equals("toggle")) {
                    if(set.contains(num)) {
                        set.remove(num);
                    }
                    else set.add(num);
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
