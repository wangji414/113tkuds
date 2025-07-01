package practice0717;

import java.util.Scanner;

public class linear_search_trace {
    //請撰寫一段 Java 程式，使用線性搜尋（Sequential Search）
    //從一個整數陣列中找尋目標數字，並印出每一次比對的過程。最後印出是否找到該數字。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = {1,2,3,4,5,6,7,8,9};
        
       
        System.out.println("請輸入要查找的數字:");
        int x = sc.nextInt();
        boolean found = false;

        for(int num : a){
            System.out.println("比對中:"+x+" Vs "+num);
            if(num == x){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
    
}
