package Silver;

import java.util.Scanner;

// Silver 5 덩치
public class Num7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Info[] info = new Info[N];
        // 정보 입력
        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            info[i] = new Info(height, weight);
        }
        // 정렬
        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
                if(info[i].height < info[j].height && info[i].weight < info[j].weight) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
        sc.close();
    }
}

class Info {
    int height; // 키 저장
    int weight; // 몸무게 저장

    public Info(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}
