package finalexam;
import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        int[] qtys = new int[n];

        for(int i=0; i<n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            names[i] = parts[0];
            qtys[i] = Integer.parseInt(parts[1]);
        }

        for(int i=0; i<n; i++) {
            String keyName = names[i];
            int keyQty = qtys[i];
            int j = i-1;

            while(j >= 0 && qtys[j] < keyQty) {
                names[j+1] = names[j];
                qtys[j+1] = qtys[j];
                j--;
            }
            names[j+1] = keyName;
            qtys[j+1] = keyQty;
        }
        for(int i=0;i<Math.min(10,n); i++){
            System.out.println(names[i] + " " + qtys[i]);
        }
        sc.close();
    }    
}
/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序法進行排序，最壞情況下每次插入需比較並移動 O(i) 次，總共n筆資料，
 *       所以時間複雜度為 O(n^2)。輸出前10筆的操作為 O(1)，不影響整體複雜度。
 */
