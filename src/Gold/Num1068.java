package Gold;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

// Gold 5 트리
public class Num1068 {
    static int N;
    static List<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[] parent = new int[N];
        tree = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new ArrayList<>();
        }
        int root = -1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            parent[i] = Integer.parseInt(st.nextToken());
            if(parent[i] == -1) {
                root = i;
            } else {
                tree[parent[i]].add(i);
            }
        }
        int deleteNode = Integer.parseInt(br.readLine());

        if(deleteNode == root) {
            System.out.println(0);
            return;
        }
        System.out.println(DFS(root, deleteNode));
    }
    private static int DFS(int root, int deleteNode) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            int node = stack.pop();
            if(node == deleteNode) continue;

            int childCount = 0;
            for (int child : tree[node]) {
                if(child == deleteNode) continue;
                stack.push(child);
                childCount++;
            }

            if(childCount == 0) {
                count++;
            }
        }
        return count;
    }
}
