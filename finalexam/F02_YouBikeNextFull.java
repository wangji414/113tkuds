package finalexam;
import java.util.*;
public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for(int i=0; i<n; i++) {
            String[] hm = sc.nextLine().split(":");
            int hours = Integer.parseInt(hm[0]);
            int minutes = Integer.parseInt(hm[1]);
            times[i] = hours * 60 + minutes; // 轉成min
        }

        //查詢
        String[] queryHM =sc.nextLine().split(":");
        int queryTime = Integer.parseInt(queryHM[0]) * 60 + Integer.parseInt(queryHM[1]);

        //找第一個大於qt的值
        int left = 0, right = n-1;
        int answerIndex = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(times[mid] > queryTime){
                answerIndex = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        if(answerIndex ==-1){
            System.out.println("No bike");
        }else{
            int ansMinutes = times[answerIndex];
            int hours = ansMinutes/60;
            int minutes = ansMinutes%60;
            System.out.printf("%02d:%02d\n",hours, minutes);
        }
        sc.close();
    }
}
/*
 * Time Complexity: O(log n)
 * 說明：先將n個時間字串轉換成分鐘格式為 O(n)，接著用二分搜尋找出第一個大於查詢時間的索引為 O(log n)，
 *       因使用二分搜尋->時間複雜度為 O(log n)。
 */
