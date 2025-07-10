import java.util.Arrays;

public class ArrayUtility {

    // 列印陣列內容 [元素1, 元素2, ...]
    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // 原地反轉陣列
    static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // 複製陣列
    static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    // 找第二大的值
    static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }

    // 主程式測試
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.println("原始陣列：");
        printArray(numbers);

        System.out.println("\n反轉後的原始陣列：");
        reverseArray(numbers);
        printArray(numbers);
        
        System.out.println("\n複製陣列：");
        int[] copy = copyArray(numbers);
        printArray(copy);

        System.out.println("\n第二大的數值：");
        int secondLargest = findSecondLargest(numbers);
        System.out.println(secondLargest);
    }
}

