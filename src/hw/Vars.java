package hw;

import java.util.Scanner;

public class Vars {
    public static void main(String[] args) {
        //1
//        Scanner scanner = new Scanner(System.in);
//        int a,b;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        System.out.println(a/b);
//        System.out.println(a%b);
        //2
//        Scanner scanner = new Scanner(System.in);
//        int a,b;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        double result;
//        result = (5*a+Math.sqrt(b))/(b-a);
//        System.out.println(result);
        //3
//        Scanner scanner = new Scanner(System.in);
//        String a,b;
//        a = scanner.nextLine();
//        b = scanner.nextLine();
//        String result;
//        result = (b+" "+a);
//        System.out.println(result);
        //4
//        Scanner scanner = new Scanner(System.in);
//        int a,b,c;
//        double result;
//        a = scanner.nextInt();
//        b = scanner.nextInt();
//        c = scanner.nextInt();
//
//        if(a!=0 && b!=0 && c!=0){
//            result = 0.1*(c-b)/a ;
//            System.out.println("x = " + result);
//        }
//        else {
//            System.out.println("Все числа должны отличаться от нуля!");
//        }


        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        double A, B;
        A=-1.0*(d-b)/(a-c);
        B=-1.0*(c*b-a*d)/(a-c);

        System.out.println("y= "+ A +"x + "+ B);
    }
}
