package midterm;
import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stops = new String[n];
        for(int i =0; i<n; i++){
            stops[i] = sc.next();
        }
        String start = sc.next();
        String end = sc.next();

        int startIndex = -1, endIndex = -1;
        for(int i = 0; i < n; i++) {
            if(stops[i].equals(start)) {
                startIndex = i;
            }
            if(stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if(startIndex == -1 || endIndex == -1){
            System.out.println("Invalid");
        }else{
            System.out.println(Math.abs(endIndex - startIndex) + 1);
        }
        sc.close();
    }    
}

/*
 * Time Complexity: O(n)
 * 說明：從陣列起點數到終點，並找出起點與終點，共 n 個站點，時間為 O(n)。
 */
