package finalexam;

import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入層序序列（-1 表 null）
        String[] values = sc.nextLine().split(" ");
        TreeNode root = buildTree(values);

        // 輸入目標值 T
        int target = sc.nextInt();

        int closest = findClosestValue(root, target);
        System.out.println("Closest: " + closest);
        sc.close();
    }

    // 建立 BST（層序建樹）
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

    // 找最接近目標值的節點（迭代 O(h)）
    public static int findClosestValue(TreeNode root, int target) {
        int closest = root.val;

        while (root != null) {
            int currDiff = Math.abs(root.val - target);
            int closestDiff = Math.abs(closest - target);

            if (currDiff < closestDiff || (currDiff == closestDiff && root.val < closest)) {
                closest = root.val;
            }

            // 根據 BST 特性往下走
            if (target < root.val) {
                root = root.left;
            } else if (target > root.val) {
                root = root.right;
            } else {
                break; // 精準命中
            }
        }

        return closest;
    }
}
