package hw;

import java.util.Random;

public class Arrays_2 {
    public static void main(String[] args) {
        int n = 3;
        int m = 6;
//        int a[][] = inputArray(n, m, 10, 100);
//        int a[][] = {{5, 4, 6}, {10, 3, 8},  {0, 2, 0}};

//        printArray(a, n, m);
        int a[][] = task12(n, m);
        printArray(a, n, m);

//        task9(a, n, m);

    }

    public static int task1(int arr[][], int n, int m) {
        int a = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < a) {
                    a = arr[i][j];
                }

            }
        }
        return a;
    }

    public static int task2(int arr[][], int n, int m) {
        int a = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > a) {
                    a = arr[i][j];
                }

            }
        }
        return a;
    }

    public static void task3(int arr[][], int n, int m) {
        int a = arr[0][0];
        int maxb = 0;
        int maxc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > a) {
                    a = arr[i][j];
                    maxb = i;
                    maxc = j;
                }

            }
        }
        System.out.println("[" + maxb + "]" + "[" + maxc + "]");
    }

    public static void task4(int arr[][], int n, int m) {
        int a = arr[0][0];
        int maxb = 0;
        int maxc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < a) {
                    a = arr[i][j];
                    maxb = i;
                    maxc = j;
                }

            }
        }
        System.out.println("[" + maxb + "]" + "[" + maxc + "]");
    }

    public static void task5(int arr[][], int n, int m) {
        int a, b, c;
        int caunt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j - 1 < 0) {
                    a = 0;
                } else a = arr[i][j - 1];
                if (j + 1 == m) {
                    c = 0;
                } else c = arr[i][j + 1];
                b = arr[i][j];
                if (b > a + c) {
                    caunt++;
                }
            }
        }
        System.out.println(caunt);
    }

    public static void task6(int arr[][], int n, int m) {

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println();
        printArray(arr, n, m);
    }

    public static void task71(int arr[][], int n, int m) {
        boolean projArr[] = new boolean[m];
        boolean unit = true;
        for (int i = 0; i < m; i++) {
            unit = true;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] != 0) unit = false;
            }
            projArr[i] = unit;

        }
        printArrayBool(projArr, m);
    }

    public static void task72(int[][] arr, int n, int m) {
        boolean projArr[] = new boolean[n];
        boolean unit = false;
        for (int i = 0; i < n; i++) {
            unit = false;
            for (int j = 1; j < m; j++) {
                if (arr[i][j] <= arr[i][j - 1]) unit = true;
                else {
                    unit = false;
                    break;
                }
            }
            projArr[i] = unit;

        }
        printArrayBool(projArr, n);
    }

    public static void task73(int[][] arr, int n, int m) {
        boolean projArr[] = new boolean[n];
        boolean unit = false;
        int p;
        for (int i = 0; i < n; i++) {
            unit = false;

            for (int j = 0; j < m / 2; j++) {
                if (arr[i][j] == arr[i][m - 1 - j]) unit = true;
                else {
                    unit = false;
                    break;
                }
            }
            projArr[i] = unit;

        }
        printArrayBool(projArr, n);
    }

    public static void task81(int[][] arr, int n, int m) {
        int[] projArr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            projArr[i] = sum;
        }
        printArray1(projArr, n);
    }

    public static void task82(int[][] arr, int n, int m) {
        int[] projArr = new int[n];
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 1;
            for (int j = 0; j < m; j++) {
                sum *= arr[i][j];
            }
            projArr[i] = sum;
        }
        printArray1(projArr, n);
    }

    public static void task83(int[][] arr, int n, int m) {
        double[] projArr = new double[n];
        double sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            sum /= m;
            projArr[i] = sum;
        }
        printArrayDouble(projArr, n);
    }

    public static void task9(int[][] arr, int n, int m) {
        int a = arr[0][0];
        int min, minn, minm;

        for (int i = 0; i < n; i++) {
            min = arr[i][0];
//            System.out.println(min);
            minm = 0;
            minn = i;
            for (int j = 1; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minm = j;
                    minn = i;
                }
            }
            for (int j = 0; j < n; j++) {
                if (arr[j][minm] > min) {
                    break;
                } else if (j == n - 1) {
                    System.out.println(min + "[" + minn + "]" + "[" + minm + "]");
                    return;
                }
            }
        }
        System.out.println("Не существует");

    }

    public static int[][] task12(int n, int m) {
        int[][] arr = new int[n][m];
        int now = 1;
        int max = n * m;
        int nmin = 0;
        int nmax = n - 1;
        int mmin = 0;
        int mmax = m - 1;

        while (now <= max) {
            for (int i = mmin; now <= max && i <= mmax; i++) {
                arr[nmin][i] = now++;
            }
            nmin++;
            for (int j = nmin; now <= max && j <= nmax; j++) {
                arr[j][mmax] = now++;
            }
            mmax--;
            for (int k = mmax; now <= max && k >= mmin; k--) {
                arr[nmax][k] = now++;
            }
            nmax--;
            for (int l = nmax; now <= max && l >= nmin; l--) {
                arr[l][mmin] = now++;
            }
            mmin++;
        }

        return arr;
    }


    public static int[][] inputArray(int n, int m, int a, int b) {
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

    public static void printArrayBool(boolean[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printArray1(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void printArrayDouble(double[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }
}