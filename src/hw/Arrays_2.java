package hw;

import java.util.Random;

public class Arrays_2 {
    public static void main(String[] args) {
        int n = 5;
        int m =6;
        int a[][] = inputArray(n,m, 0,10000);
        printArray(a,n,m);
        System.out.println(task1(a,n,m));

    }

    public static int task1(int arr[][], int n, int m) {
        int a = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]<a){
                    a=arr[i][j];
                }

    }}
        return a;}

    public  static int[][] inputArray(int n, int m, int a, int b) {
        int arr[][] = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(a, b);
            }
        }

        return arr;
    }

    public static void printArray(int arr[][], int n, int m) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}