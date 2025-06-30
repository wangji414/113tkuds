import java.util.Scanner;
public class ds_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String city;
        System.out.println("請輸入姓名");
        name = sc.nextLine();

        System.out.println("請輸入年齡");
        age = sc.nextInt();        
        sc.nextLine();

        System.out.println("請輸入城市");
        city = sc.nextLine();
        sc.close();
        System.out.println("你是"+name+","+"今年"+age+"歲,住在"+city+"。");
    }
}
