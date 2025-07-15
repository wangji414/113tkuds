package midterm;
import java.util.Scanner;

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] k = new int[n];
        int total = 0;

        for(int i=0; i<n; i++) {
            k[i] = Integer.parseInt(sc.nextLine());
        }

        for(int i=0; i<n; i++) {
            int bill = (int)Math.round(calc(k[i]));
            System.out.println("Bill: $"+bill);
            total += bill;
        }

        int avg = (int)Math.round((double)total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $"+avg);
        sc.close();
    }   

    //分段計價
    private static double calc(int k){
        if(k <= 120) {
            return k * 1.68;
        }else if(k>120 && k <= 330){
            return 120 * 1.68 + (k - 120) * 2.45;
        }else if(k>330 && k <= 500){
            return 120 * 1.68 + (330 - 120) * 2.45 + (k - 330) * 3.70;
        }else if(k>500 && k <= 700){
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (k - 500) * 5.04;
        }else if(k>700 && k<= 1000){
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (700 - 500) * 5.04 + (k - 700) * 6.24;
        }else{
            return 120 * 1.68 + (330 - 120) * 2.45 + (500 - 330) * 3.70 + (700 - 500) * 5.04 + (1000 - 700) * 6.24 + (k - 1000) * 8.46;
        }
    }
}
/*
 * Time Complexity: O(n)
 * 說明：每筆輸入資料呼叫一次calc，calc為O(1)，因此總和為O(n)。
 */
