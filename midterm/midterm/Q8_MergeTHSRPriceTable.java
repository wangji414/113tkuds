package midterm;
import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] stations = new String[n];
        int[][] price = new int[n][2];

        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
            price[i][0] = sc.nextInt();
            price[i][1] = sc.nextInt();
        }

        
        System.out.printf("%-6s|%-8s|%-8s\n", "Station", "Standard", "Business");

       
        for (int i = 0; i < n; i++) {
            System.out.printf("%-6s|%-8d|%-8d\n", stations[i], price[i][0], price[i][1]);
        }
        sc.close();
    }
}

