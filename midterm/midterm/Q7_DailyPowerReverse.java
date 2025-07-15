package midterm;
import java.util.Scanner;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dp = new int[7];
        for(int i=0; i<7; i++){
            dp[i] = sc.nextInt();
        }

        int left = 0, right = 6;
        while(left<right){
            int temp = dp[left];
            dp[left] = dp[right];
            dp[right] = temp;
            left++;
            right--;
        }

        for(int i=0; i<7; i++){
            System.out.print(dp[i]);
            if(i<6)
                System.out.print(" ");           
            }
        System.out.println();
        sc.close();
    }
}
