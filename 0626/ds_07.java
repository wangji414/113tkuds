import java.util.Random;
public class ds_07 {
    //請撰寫一個 Java 程式，創建一個 3x3 的二維陣列，並輸出其所有元素。
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Random rd = new Random(123);

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = rd.nextInt(10);
            }
        }
        
        System.out.println("3x3陣列:");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
