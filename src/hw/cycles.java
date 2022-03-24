package hw;

import java.util.Scanner;

public class cycles {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        dz3();

    }

    public static void dz1() {
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(Math.pow(a, b));
    }

    public static void dz2() {
        int a;
        a = scan.nextInt();
        for (int i = 0; i < 1000; i++) {
            if (i % a == 0) {
                System.out.println(i);
            }
        }
    }

    public static void dz3() {
        int a;
        a = scan.nextInt();
        int val = 0;
        for (int i = 0; i < a; i++) {
            if (Math.pow(i,2) < a) {
                val+=1;
            }
        }
    System.out.println(val);
    }
    public static void dz4() {
        int a;
        a = scan.nextInt();
        int val = 0;
        for (int i = 0; i < a; i++) {
            if (Math.pow(i,2) < a) {
                val+=1;
            }
        }
        System.out.println(val);
    }
}