import java.util.Scanner;
public class ds_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("請輸入半徑:");
        r = sc.nextDouble();
        System.out.println(Math.pow(r,2)*Math.PI);
        sc.close();
    }
}
