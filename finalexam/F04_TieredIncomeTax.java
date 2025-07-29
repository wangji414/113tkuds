package finalexam;
import java.util.*;
public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] incomes =new int[n];
        int[] taxes = new int[n];
        int totalTax = 0;
        
        for(int i=0; i<n; i++) {
            incomes[i] = sc.nextInt();
            taxes[i] = calculateTax(incomes[i]);
            totalTax += taxes[i];
        }
        for(int i=0; i<n; i++) {
            System.out.println("Tax: $"+taxes[i]);
        }
        double avg = totalTax/(double)n;
        System.out.printf("Average Tax: $%.1f\n", avg);
        sc.close();
    }
        public static int calculateTax(int income){
            int tax=0;
            int[] brackets ={0,560000,1260000,2520000,4720000};
            int[] rates ={5,12,20,30,40};

            int[] limits = {560000, 1260000, 2520000, 4720000, Integer.MAX_VALUE};
            for(int i=0; i<5; i++){
                if(income > brackets[i]){
                    int taxable = Math.min(income, brackets[i]+limits[i]-brackets[i]);
                    tax += taxable * rates[i] / 100;
                }
            }
            return tax;
        }
}

/*
 * Time Complexity: O(n)
 * 說明：讀入n筆收入後，對每筆資料呼叫 calculateTax()，其內部最多執行 5 次固定級距計算（O(1）），
 *       所以總體為 O(n)。計算總和與平均也為 O(n)，因此整體時間複雜度為 O(n)。
 */
