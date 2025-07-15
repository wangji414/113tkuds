package midterm;
import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] tokens = sc.nextLine().split(" ");
        int[] wins = new int[n];
        int[] prefixSum = new int[n+1];

        for(int i=0; i<n; i++){
            wins[i] = Integer.parseInt(tokens[i]);
            prefixSum[i+1] = prefixSum[i] + wins[i];
        }

        int k = Integer.parseInt(sc.nextLine());

        System.out.print("PrefixSum:");
        for(int i=1; i<=k; i++){
            System.out.print(" " + prefixSum[i]);
        }
        System.out.println();
        sc.close();
    }
}
/*
 * Time Complexity: O(n)
 * 說明：建立prefixSum陣列時走訪一次長度為n的陣列，因此時間複雜度為O(n)。
 */