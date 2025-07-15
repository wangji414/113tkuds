package midterm;
import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] timeStr = new String[n];
        for (int i = 0; i < n; i++) {
            timeStr[i] =  sc.nextLine();
            times[i] = toMinutes(timeStr[i]);
        }
        String queryStr = sc.nextLine();
        int query = toMinutes(queryStr);

        int left = 0; int right = n-1;
        int index = n;
         while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (index == n) {
            System.out.println("No train");
        } else {
            System.out.println(timeStr[index]);
        }
        sc.close();
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找出下一班列車，搜尋範圍為長度 n 的已排序陣列，時間為 O(log n)。
 */