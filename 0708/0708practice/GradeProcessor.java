public class GradeProcessor {
    public static void main(String[] args) {
        int[] grades ={78,85,92,67,88,95,73,90};  //八個學生的成績
        int total = 0;  //總分
        double avg = 0; //平均
        int max  = grades[0]; //最高分
        int min = grades[0]; //最低分
        int maxIndex=0, minIndex=0;
        int count = 0;

        for(int i=0; i<grades.length; i++) {
            total += grades[i]; //總分
            
            if(grades[i]>max){
                max = grades[i];
                maxIndex = i;
            }

            if(grades[i]<min){
                min = grades[i];
                minIndex = i;
            }
        }

        avg = total / grades.length;
        System.out.println("總分: "+total+"\n平均分數: "+avg);
        
        //計算高於平均的數量
        for(int i=0; i<grades.length; i++) {
            if(grades[i] > avg) {
                count++;
            }
        }
        System.out.println("最高分 "+max+" 索引: "+maxIndex);
        System.out.println("最低分 "+min+" 索引: "+minIndex);
        System.out.println("高於平均的學生數: "+count);

        //輸出所有成績
        System.out.println("學生成績列表:");
        for(int i=0; i<grades.length; i++) {
            System.out.println("學生編號"+(i+1)+"的成績: "+grades[i]);
        }
    }
}
