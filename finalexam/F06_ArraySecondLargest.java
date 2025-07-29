package finalexam;
import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = findMaxAndSecond(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
        sc.close();
    }

    // 回傳 int[2] => [最大值, 次大值]
    public static int[] findMaxAndSecond(int[] arr, int left, int right) {
        if (right - left == 1) {
            // 兩個元素直接比較
            if (arr[left] > arr[right]) {
                return new int[]{arr[left], arr[right]};
            } else {
                return new int[]{arr[right], arr[left]};
            }
        } else if (left == right) {
            // 單一元素，次大值設為 Integer.MIN_VALUE（無效值）
            return new int[]{arr[left], Integer.MIN_VALUE};
        }

        int mid = (left + right) / 2;
        int[] leftPair = findMaxAndSecond(arr, left, mid);
        int[] rightPair = findMaxAndSecond(arr, mid + 1, right);

        int max, second;
        if (leftPair[0] > rightPair[0]) {
            max = leftPair[0];
            second = Math.max(leftPair[1], rightPair[0]);
        } else {
            max = rightPair[0];
            second = Math.max(rightPair[1], leftPair[0]);
        }

        return new int[]{max, second};
    }
}

/*
 * Time Complexity: O(n)
 * 說明：使用分治法將陣列對半拆分，並在合併階段比較最大與次大值。
 *       每層合併為常數操作，遞迴遍歷整個陣列一次，因此總時間複雜度為 O(n)。
 */

