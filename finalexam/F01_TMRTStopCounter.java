package finalexam;
import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //站數
        String[] stops = new String[n];

        for(int i=0; i<n; i++){
            stops[i] = sc.next();    
        }
        String start = sc.next(); //起點
        String end = sc.next(); //終點

        int startIndex = -1;
        int endIndex = -1;

        for(int i=0; i<n; i++){
            if(stops[i].equals(start)) {
                startIndex = i;
            }
            if(stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if(startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIndex - endIndex)+1);
        }
        sc.close();
    }
}
/*
 * Time Complexity: O(n)
 * 說明：需逐一讀入 n 個站名 (O(n))，再線性掃描找起下一站位置 (O(n))，其餘操作皆為常數時間，
 *       所以總時間複雜度為 O(n)。
 */
