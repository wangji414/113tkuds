package practice0717;

public class array_sum_trace {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int total= 0;
        for(int i=0; i<a.length; i++){
            total += a[i];
            if(i<a.length-1){
                System.out.println("加總過程:total="+total+"+"+a[i+1]+"="+(total+a[i+1]));
            }
        }
        System.out.println("總和為:"+total);
    }
    
}
