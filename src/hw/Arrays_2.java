package hw;

import java.util.Random;

public class Arrays_2 {
    public static void main(String[] args) {
        int n = 4;
        int m =5;
//        int a[][] = inputArray(n,m, 0,2);
        int a[][] = {{0,0,0,0,1},{0,1,0,1,0},{0,0,0,0,0},{0,5,4,0,0}};

        printArray(a,n,m);
//        System.out.println(task2(a,n,m));
        task72(a,n,m);

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

    public static int task2(int arr[][], int n, int m) {
        int a = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]>a){
                    a=arr[i][j];
                }

            }}
        return a;}

    public static void task3(int arr[][], int n, int m) {
        int a = arr[0][0];
        int maxb=0;
        int maxc=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]>a){
                    a=arr[i][j];
                    maxb = i;
                    maxc = j;
                }

            }}
        System.out.println("["+maxb+"]"+"["+maxc+"]");}

    public static void task4(int arr[][], int n, int m) {
        int a = arr[0][0];
        int maxb=0;
        int maxc=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]<a){
                    a=arr[i][j];
                    maxb = i;
                    maxc = j;
                }

            }}
        System.out.println("["+maxb+"]"+"["+maxc+"]");}

    public static void task5(int arr[][], int n, int m) {
        int a,b,c;
        int caunt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j-1<0){a=0;} else a = arr[i][j-1];
                if (j+1==m){c=0;} else c = arr[i][j+1];
                b=arr[i][j];
                if(b>a+c){
                    caunt++;
                }
            }}
        System.out.println(caunt);}

    public static void task6(int arr[][], int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println();
        printArray(arr,n,m);
    }
    public static void task71(int arr[][], int n, int m) {
        boolean projArr[]= new boolean[m];
        boolean unit=true;
        for (int i = 0; i < m; i++) {
            unit=true;
            for (int j = 0; j < n; j++) {
                if (arr[j][i]!=0)unit=false;
            }
            projArr[i]=unit;

        }
        printArrayBool(projArr,m);}

    public static void task72(int[][] arr, int n, int m) {
        boolean projArr[]= new boolean[n];
        boolean unit=false;
        for (int i = 0; i < n; i++) {
            unit=false;
            for (int j = 1; j < m; j++) {
                if (arr[i][j]>=arr[i][j-1])unit=true;
                else {
                    unit=false;
                    break;
                }
            }
            projArr[i]=unit;

        }
        printArrayBool(projArr,n);}

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
    public static void printArrayBool(boolean[] a, int n){
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }
}