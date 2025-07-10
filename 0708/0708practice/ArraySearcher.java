public class ArraySearcher {
    static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 返回找到的索引
            }
        }
        return -1;
    }

    static int countOccurrences(int[] array, int target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int index67 = findElement(arr, 67);
        int index100 = findElement(arr, 100);

        if(index67 != -1){
            System.out.println("67的索引是: " + index67);
        } else {
            System.out.println("67不在陣列中");
        }

        if(index100 != -1){
            System.out.println("100的索引是: " + index100);
        } else {
            System.out.println("100不在陣列中");
        }
    }

}
