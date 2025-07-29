package finalexam;

import java.util.*;

public class F08_ClimbStairsMemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        int ways = countWays(n, memo);
        System.out.println("Ways: " + ways);
        sc.close();
    }

    // 回傳走到第 n 階的方法數
    public static int countWays(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0) return 1;

        if (memo[n] != -1) return memo[n];

        memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
        return memo[n];
    }
}
