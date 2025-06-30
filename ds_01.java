import java.util.Scanner;
public class ds_01 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入1號數字:");
        a = sc.nextInt();
        System.out.println("請輸入2號數字:");
        b = sc.nextInt();
        System.out.println("總和為:"+(a+b));
        sc.close();
    }
}
