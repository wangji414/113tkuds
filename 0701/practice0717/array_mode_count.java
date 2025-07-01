package practice0717;

public class array_mode_count {
    public static void main(String[] args) {
    
    
        int[] a = {3,7,3,1,1,1};

        int mode = a[0];
        int maxCount = 1;
    
        for(int i=0; i<a.length; i++){
            int count =0;
            for(int j=0; j<a.length; j++){
                if(a[i] == a[j]){
                count++;
                }
            }
            System.out.println("比對中:"+a[i]+",出現 "+count+" 次");
            if(count > maxCount){
                mode = a[i];
                maxCount = count;
            }
        }
        System.out.println("眾數為:"+mode+",出現"+maxCount+" 次");
 
    }
}
