package finalexam;

import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        if (values.length == 0 || values[0].equals("-1")) {
            System.out.println("LeftView:");
            sc.close();
            return;
        }

        TreeNode root = buildTree(values);
        List<Integer> leftView = getLeftView(root);

        System.out.print("LeftView:");
        for (int val : leftView) {
            System.out.print(" " + val);
        }
        System.out.println();
        sc.close();
    }

    // 建立二元樹（層序，-1 表 null）
    public static TreeNode buildTree(String[] values) {
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < values.length && !values[i].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // 取得每層最左側節點（BFS）
    public static List<Integer> getLeftView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            result.add(queue.peek().val);  // 每層的第一個節點就是左視圖

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return result;
    }
}
