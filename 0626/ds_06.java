import java.util.Random;
public class ds_06 {
    //請撰寫一個 Java 程式，創建一個包含 10 個隨機整數的一維陣列，並找出其中的最大值。
    public static void main(String[] args) {
        int [] a = new int[10];
        Random rd = new Random(222);
        
        for(int i=0; i<a.length; i++){
            a[i] = rd.nextInt(50);
            System.out.println("a["+i+"]="+a[i]);
        }
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("最大值為:"+max);
    }

}
