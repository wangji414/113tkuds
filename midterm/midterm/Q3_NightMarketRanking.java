package midterm;
import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        // 由大到小的選擇排序
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIndex]) {
                    maxIndex = j;
                }
            }
            double temp = scores[i];
            scores[i] = scores[maxIndex];
            scores[maxIndex] = temp;
        }

        int outputCount = Math.min(5, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：外層迴圈、內層迴圈都為O(n)，總共為O(n^2)。
 */
