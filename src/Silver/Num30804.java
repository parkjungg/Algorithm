package Silver;


import java.util.HashMap;
import java.util.Scanner;

// Silver 2 과일 탕후루
public class Num30804 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] fruit = new int[N];

        for (int i = 0; i < N; i++) {
            fruit[i] = sc.nextInt();
        }
        System.out.println(maxFruit(fruit, N));
    }
    private static int maxFruit(int[] fruit, int N) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < N; right++) {
            hashMap.put(fruit[right], hashMap.getOrDefault(fruit[right], 0) + 1);

            while(hashMap.size() > 2) {
                hashMap.put(fruit[left], hashMap.get(fruit[left]) - 1);
                if(hashMap.get(fruit[left]) == 0) {
                    hashMap.remove(fruit[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
