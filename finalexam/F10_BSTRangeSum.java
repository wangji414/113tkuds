package finalexam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入 BST 層序序列（-1 表 null）
        String[] values = sc.nextLine().split(" ");
        TreeNode root = buildTree(values);

        // 輸入區間 L R
        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = rangeSumBST(root, L, R);
        System.out.println("Sum: " + sum);
        sc.close();
    }

    // 建立 BST（層序輸入）
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("-1")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode curr = queue.poll();

            if (i < values.length && !values[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(curr.left);
            }
            i++;

            if (i < values.length && !values[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(curr.right);
            }
            i++;
        }

        return root;
    }

    // 中序走訪＋剪枝，計算區間總和
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        if (root.val < L) {
            // 左子樹都太小，跳過
            return rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            // 右子樹都太大，跳過
            return rangeSumBST(root.left, L, R);
        } else {
            // 在區間內，加總左右子樹
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
    }
}

