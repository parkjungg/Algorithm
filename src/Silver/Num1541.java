package Silver;


import java.util.Scanner;

// Silver 2 잃어버린 괄호
public class Num1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] arr = s.split("-"); // '-' 를 기준으로 문자열을 나눔
        int result = sum(arr[0]); // '-' 이전의 값을 모두 더함
        for (int i = 1; i < arr.length; i++) {
            result -= sum(arr[i]);
        }
        System.out.println(result);
        sc.close();
    }
    private static int sum(String s) {
        String[] array = s.split("\\+"); // + 기준으로 문자열을 나눔
        int total = 0;
        for (String num : array) {
            total += Integer.parseInt(num);
        }
        return total;
    }
}
