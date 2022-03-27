package hw;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int n=20;
        int[] a = inputArrayWithRandom(n,0,20);
        printArray(a,n);
        printArray(selectSortDecr(a,n),n);
//        printArray(task6(a,n),n);
//        System.out.println(task7(n));

//        printArray(task8(a,n),n);

    }

    public static int task1(int[] ar, int n){
        int a = ar[0];
        for (int k=0;k<n-1;k++){
            if(ar[k]<a){
                a = ar[k];
            }
        }
        return a;
    }

    public static int task2(int[] ar, int n){
        int a = ar[0];
        for (int k=0;k<n-1;k++){
            if(ar[k]>a){
                a = ar[k];
            }
        }
        return a;
    }

    public static int task3(int[] ar, int n){
        int a = ar[0];
        int b = 0;
        for (int k=0;k<n-1;k++){
            if(ar[k]<a){
                a = ar[k];
                b = k;
            }
        }
        return b;
    }

    public static int task4(int[] ar, int n){
        int a = ar[0];
        int b = 0;
        for (int k=0;k<n-1;k++){
            if(ar[k]>a){
                a = ar[k];
                b = k;
            }
        }
        return b;
    }

    public static int task5(int[] ar, int n){
        int a = 0;
        for (int k=1;k<n-1;k+=2){
                a+=ar[k];
            }
        return a;
    }

    public static int[] task6(int[] ar, int n){
        int a = 0;
        int[] newar = new int[n];
        for (int k=n-1;k>-1;k--){
            newar[a] = ar[k];
            a++;
        }
        return newar;
    }

    public static int task7(int n){
        if(n%2==0){
            return n/2;
        } else return n/2+1;

    }

    public static int[] task8(int[] ar, int n){
        int a = 0;
        int[] newar = new int[n];

        for (int k=n/2;k<n;k++){
            newar[a] = ar[k];
            a++;
            if(a>n/2+1) break;

        }
        for (int k = 0; k<n/2+1; k++ ){
            newar[a] = ar[k];
            a++;
            if(a>n-1) break;
        }

        return newar;
    }
    public static int[] selectSortDecr(int[] a, int n){
        for (int k=0;k<n-1;k++){
            int minPos = k;
            for (int j = k+1;j<n; j++){
                if(a[j]>a[minPos]){
                    minPos = j;
                }
            }
        if(minPos!=k){
            int temp = a[minPos];
            a[minPos]=a[k];
            a[k]= temp;
        }
    }
    return a;}

    public static int[] bubbleSortIncr(int[] a, int n){
        for (int k=0;k<n-1;k++)
            for (int i = 1;i<n;i++){
                if(a[i]<a[i-1]){
                    int temp = a[i];
                    a[i]=a[i-1];
                    a[i-1] = temp;
                }
            }
        return a;
    }

    public static int[] inputArrayWithRandom(int n, int a, int b){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = random.nextInt(a,b);
        return arr;
    }
    public static int[] inputArray(int n){
        int[] a = new int[n];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();}
        return a;
    }
    public static void printArray(int[] a, int n){
        for (int i = 0; i < n; i++){
        System.out.print(a[i] + ",");
    }
        System.out.println();
}}