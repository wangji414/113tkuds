package finalexam;

import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int maxDiameter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入：層序序列，-1 表 null
        String[] values = sc.nextLine().split(" ");
        TreeNode root = buildTree(values);

        int diameter = treeDiameter(root);
        System.out.println("Diameter: " + diameter);
        sc.close();
    }

    // 建立二元樹（層序建樹）
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

    // 主函式，回傳直徑
    public static int treeDiameter(TreeNode root) {
        maxDiameter = 0;
        dfs(root);
        return maxDiameter;
    }

    // 後序遞迴：回傳當前節點的高度，並更新最大直徑
    public static int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        int localDiameter = leftHeight + rightHeight; // 經過當前節點的最大路徑邊數
        maxDiameter = Math.max(maxDiameter, localDiameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
