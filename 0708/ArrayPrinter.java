public class ArrayPrinter {
    /*將整數陣列轉換為字串表示法，模擬Arrays.toString()的功能
     * 展示如何透過所引來循序存取陣列元素
    */
    static String arrayToString(int[] array){
        //處理空陣列的特殊情況
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");

        //使用傳統for迴圈來控制格事輸出
        for(int i = 0; i < array.length; i++){
            sb.append(array[i]);
            //如果不是最後一個元素，則添加逗號和空格
            if(i < array.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //列印陣列的詳細資訊，包括索引和值的對應關係
    static void printArrayWithIndex(int[] array) {
        System.out.println("索引\t值");
        System.out.println("----\t---");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d\t%d\n", i, array[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] emptyArray = {};
        int[] nullArray = null;

        System.out.println("一般陣列:"+arrayToString(numbers));
        System.out.println("空陣列:"+arrayToString(emptyArray));
        System.out.println("null陣列:"+arrayToString(nullArray));

        System.out.println("\n詳細資訊");
        printArrayWithIndex(numbers);
    }   
}
