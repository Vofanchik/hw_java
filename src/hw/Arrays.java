package hw;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int n=20;
        int[] a = inputArrayWithRandom(n,0,20);
        printArray(a,n);
        for (int k=0;k<n-1;k++)
            for (int i = 1;i<n;i++){
                if(a[i]<a[i-1]){
                    int temp = a[i];
                    a[i]=a[i-1];
                    a[i-1] = temp;
                }
            }
        printArray(a,n);
    }

    public static int[] inputArrayWithRandom(int n, int a, int b){
        Random random = new Random();
        int arr[] = new int[n];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++)
            arr[i] = random.nextInt(a,b);
        return arr;
    }
    public static int[] inputArray(int n){
        int a[] = new int[n];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();}
        return a;
    }
    public static void printArray(int a[], int n){
        for (int i = 0; i < n; i++){
        System.out.print(a[i] + ",");
    }
        System.out.println();
}}