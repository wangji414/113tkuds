package practice0717;

public class matrix_multiplication_trace {
    //請撰寫一個 Java 程式，實作兩個 2x2 矩陣相乘
    //並在每個位置的計算時印出完整的乘法與加總過程。最後印出結果矩陣。
    public static void main(String[] args) {
        int[][] a ={
            {1,2},
            {3,4}
        };

        int[][] b ={
            {5,6},
            {7,8}
        };

        int[][]c = new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print("計算位置 c["+i+"]["+j+"]:");

                int sum=0;
                StringBuilder ans = new StringBuilder();

                for(int k=0; k<2; k++){
                    int partial = a[i][k] * b[k][j];
                    sum +=partial;
                    
                    if(k>0){
                        ans.append(" + ");
                    }
                    ans.append(a[i][k]+"*"+b[k][j]);
                }
                System.out.println(ans.toString()+" = "+sum);
                c[i][j]=sum;
            }
        }
        System.out.println("目標矩陣:");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
