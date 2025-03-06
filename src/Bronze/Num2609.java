package Bronze;

import java.util.Scanner;

// Bronze 1 최대공약수와 최소공배수
public class Num2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int num = 1;
        int most = 1; // 최대공약수
        // 최대공약수
        while(true) {
            if(N % num == 0 && M % num == 0) {
                most = num;
                num++;
            } else num++;
            if(num == N+1 || num == M+1) break;
        }
        System.out.println(most);
        num = 1;

        // 최소공배수
        System.out.println(N * M / most); // N * M / 최대공약수는 최소 공배수임
        sc.close();
    }
    // 유클리드 호제법을 이용한 최대공약수 구하기
//    public int Euclidean(int a,int b) {
//        int r;
//        while(b!=0) {
//            r = a % b;
//            a = b;
//            b = r;
//        }
//        return a;
//    }
}

