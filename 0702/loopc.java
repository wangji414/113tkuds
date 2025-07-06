public class loopc {
    public static void main(String[] args) {
        int x =0;
        int count = 0;
        for(int i=0; i<100; i+=2){
            x+=1;
            count++;
    }
    System.out.println("Sum of odd numbers between 1 and 100 is: "+x);
    System.out.println("Count of odd numbers between 1 and 100 is: "+count);
    }
}