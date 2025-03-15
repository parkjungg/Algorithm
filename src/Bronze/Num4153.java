package Bronze;


import java.util.Scanner;

// Bronze 3 직각삼각형
public class Num4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int A2 = A*A;
            int B2 = B*B;
            int C2 = C*C;

            if(A==0 && B==0 && C==0) {
                break;
            }
            if(A2+B2 == C2 || A2+C2 == B2 || B2+C2 == A2) {
                System.out.println("right");
            } else System.out.println("wrong");
        }



    }
}
