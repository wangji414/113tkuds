public class ds_05 {
    //請撰寫一個 Java 程式，創建一個包含 10 個整數的一維陣列，並計算所有元素的總和。
    public static void main(String[] args) {
        int sum = 0;
        int a[] = {3,8,23,1,6,7,8,11,12,33};
        for(int i=0; i<a.length; i++){          
            sum = sum + a[i];           
        }
        System.out.println("總和為"+sum);

    }
}


