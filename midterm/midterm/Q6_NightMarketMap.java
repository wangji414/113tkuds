package midterm;
import java.util.Scanner;

public class Q6_NightMarketMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map =new int[10][10];
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0; i<m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r>=0 && r<10 && c>=0 && c<10){
                map[r][c] = 1;  //標記
            }
        }

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(map[i][j] ==1 ? "*" : "#");
            }
            System.out.println();
        }
        sc.close();
    }
}
