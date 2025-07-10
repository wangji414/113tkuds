public class StudentGradeSystem {

    // 方法：回傳分數對應的等級
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 方法：顯示完整成績報告
    public static void printReport(int[] scores) {
        int total = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int aboveAverageCount = 0;

        // 計算總和、最大最小值、等級統計
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            total += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }

            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = (double) total / scores.length;

        // 計算高於平均的人數
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }

        double aboveAveragePercent = (double) aboveAverageCount / scores.length * 100;

        // 顯示報告
        System.out.println("========= 學生成績報告 =========");
        System.out.println("總人數：" + scores.length);
        System.out.printf("平均分數：%.2f\n", average);
        System.out.println("最高分：" + max + "（學生編號：" + maxIndex + "）");
        System.out.println("最低分：" + min + "（學生編號：" + minIndex + "）");
        System.out.println("A 等人數：" + countA);
        System.out.println("B 等人數：" + countB);
        System.out.println("C 等人數：" + countC);
        System.out.println("D 等人數：" + countD);
        System.out.printf("高於平均分比例：%.1f%%\n", aboveAveragePercent);
        System.out.println("================================");

        // 顯示詳細成績列表
        System.out.println("學生編號\t分數\t等級");
        System.out.println("-----------------------------");
        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i]);
            System.out.printf("%d\t\t%d\t%c\n", i, scores[i], grade);
        }
    }

    // 主程式
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(scores);
    }
}
