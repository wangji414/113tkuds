public class ArrayStatistics {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};
        int sum = 0;
        double average;
        int max = numbers[0], min = numbers[0];
        int maxIndex = 0, minIndex = 0;
        int countAboveAverage = 0;
        int evenCount = 0, oddCount = 0;

        // 計算總和、最大最小值
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        average = (double) sum / numbers.length;

        // 計算大於平均的數量
        for (int num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }
        }

        // 表格輸出
        System.out.println("========== 陣列統計分析 ==========");
        System.out.printf("總和：%d\n", sum);
        System.out.printf("平均值：%.2f\n", average);
        System.out.printf("最大值：%d（索引位置：%d）\n", max, maxIndex);
        System.out.printf("最小值：%d（索引位置：%d）\n", min, minIndex);
        System.out.printf("大於平均的數量：%d\n", countAboveAverage);
        System.out.printf("偶數個數：%d\n", evenCount);
        System.out.printf("奇數個數：%d\n", oddCount);
        System.out.println("==================================");
    }
}

