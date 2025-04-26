package Silver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Silver 1 트리 순회
public class Num1991 {
    static Node[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new Node[26];

        for (int i = 0; i < N; i++) {
            tree[i] = new Node((char) ('A' + i));
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            if(left != '.') {
                tree[parent - 'A'].left = tree[left - 'A'];
            }
            if(right != '.') {
                tree[parent - 'A'].right = tree[right - 'A'];
            }
        }

        Preorder(tree[0]);
        System.out.println();
        Inorder(tree[0]);
        System.out.println();
        Postorder(tree[0]);
    }

    private static void Preorder(Node node) {
        if(node == null) return;
        System.out.print(node.data);
        Preorder(node.left);
        Preorder(node.right);
    }

    private static void Inorder(Node node) {
        if(node == null) return;
        Inorder(node.left);
        System.out.print(node.data);
        Inorder(node.right);
    }

    private static void Postorder(Node node) {
        if(node == null) return;
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data);
    }
}

class Node {
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
    }
}
