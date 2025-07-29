package finalexam;
import java.util.*;
public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcdSubtract(a,b);
        int lcm = a*b / gcd;

        System.out.println("LCM: " +lcm);
        sc.close();
    }
    public static int gcdSubtract(int a, int b){
        if(a==b) return a;
        if(a>b) return gcdSubtract(a-b, b);
        else return gcdSubtract(a, b-a);
    }
}
/*
 * Time Complexity: O(max(a, b))
 * 說明：使用輾轉相減法（不取餘數的遞迴版本），每次遞迴最多只減去一個數值，最壞情況下需遞迴 max(a, b) 次，
 *       所以時間複雜度為 O(max(a, b))。計算 LCM 為 O(1)，不影響整體複雜度。
 */
