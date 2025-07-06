package practice0702;

import java.util.Scanner;

public class q5matrixmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n]; 

        //矩陣a
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }

        //矩陣b
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                B[i][j] = sc.nextInt();
            }
        }

        int ops = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = 0; // 初始化C[i][j]
                for(int k=0; k<n; k++){
                    C[i][j] += A[i][k] * B[k][j];
                    ops+=2;
                }
            }
        }

        //輸出矩陣C
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println(C[i][j]);
                if(j<n-1)System.out.println(" ");
            }
            System.out.println("");
        }
        System.out.println(ops);
    }
}
