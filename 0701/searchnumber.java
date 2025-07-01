import java.util.Scanner;
public class searchnumber{
    public static void main(String [] args){
        int[] s = {1,3,5,7,9,11,13}; //已排序的數列
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入要查找的數字:");
        int x = sc.nextInt();
        boolean found = false;

        for(int num : s){
            System.out.println("比對中:x = "+x+"，目前元素="+num);
            if(num == x){
                found = true;
                break;
            }
        }
        sc.close();
        System.out.println(found);
        

    }

}