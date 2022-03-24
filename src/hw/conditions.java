package hw;

import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        //1
//        Scanner scan = new Scanner(System.in);
//        int a,b;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        if(a>b){
//            System.out.println(a+b);
//        }
//        else if (a==b){
//            System.out.println(a*b);
//        }
//        else {
//            System.out.println(a-b);
//        }
        //2
//        Scanner scan = new Scanner(System.in);
//        int a,b;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        if(a>0 && b>0){
//            System.out.println("1 quater");
//        }
//        else if(a<0 && b>0){
//            System.out.println("2 quater");
//        }
//        else if(a<0 && b<0){
//            System.out.println("3 quater");
//        }
//        else if(a>0 && b<0){
//            System.out.println("4 quater");
//        }
//        else {
//            System.out.println("On axis");
//        }
        //3
//        Scanner scan = new Scanner(System.in);
//        int a,b,c;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        if (a<c && a<b){
//            System.out.println(a);
//            if(b<c){
//                System.out.println(b);
//                System.out.println(c);
//            }
//            else {
//                System.out.println(c);
//                System.out.println(b);
//            }
//        }
//        else if(b<c && b<a){
//            System.out.println(b);
//            if(a<c){
//                System.out.println(a);
//                System.out.println(c);
//            }
//            else {
//                System.out.println(c);
//                System.out.println(a);
//            }
//        }
//        else if(c<b && c<a){
//            System.out.println(c);
//            if(a<b){
//                System.out.println(a);
//                System.out.println(b);
//            }
//            else {
//                System.out.println(b);
//                System.out.println(a);
//            }
//        }

        //4
//        Scanner scan = new Scanner(System.in);
//        double a, b, c,d, x1, x2;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        d = Math.pow(b, 2) - 4 * a * c;
//        System.out.println("d= "+d);
//        if (d > 0) {
//            x1 = (-b + Math.sqrt(d)) / (2 * a);
//            x2 = (-b - Math.sqrt(d)) / (2 * a);
//            System.out.println("x1=" + x1 + " x2=" + x2);
//        } else if (d == 0) {
//            x1 = (-b / (2 * a));
//            System.out.println("x=" + x1);
//
//        } else {
//            System.out.println("Sqrt doesn't exist");
//
//        }
        //5
//        Scanner scan = new Scanner(System.in);
//        int a;
//        a = scan.nextInt();
//        if(a>9 && a<20){
//            switch (a){
//                case(10):
//                    System.out.println("ten");
//                    break;
//                case(11):
//                    System.out.println("eleven");
//                    break;
//                case(12):
//                    System.out.println("twelve");
//                    break;
//                case(13):
//                    System.out.println("thirtteen");
//                    break;
//                case(14):
//                    System.out.println("fourteen");
//                    break;
//                case(15):
//                    System.out.println("fifteen");
//                    break;
//                case(16):
//                    System.out.println("sixteen");
//                    break;
//                case(17):
//                    System.out.println("seventeen");
//                    break;
//                case(18):
//                    System.out.println("eighteen");
//                    break;
//                case(19):
//                    System.out.println("nineteen");
//                    break;
//            }
//        }
//        else{
//            int b;
//            int c;
//            c = a%10;
//            b=a/10;
//            switch (b){
//                case (2):
//                    System.out.print("twenty ");
//                    break;
//                case (3):
//                    System.out.print("thirty ");
//                    break;
//                case (4):
//                    System.out.print("forty ");
//                    break;
//                case (5):
//                    System.out.print("fifty ");
//                    break;
//                case (6):
//                    System.out.print("sixty ");
//                    break;
//                case (7):
//                    System.out.print("seventy ");
//                    break;
//                case (8):
//                    System.out.print("eighty ");
//                    break;
//                case (9):
//                    System.out.print("ninety ");
//                    break;
//            }
//            switch (c){
//                case (1):
//                    System.out.print("one");
//                    break;
//                case (2):
//                    System.out.print("two ");
//                    break;
//                case (3):
//                    System.out.print("three ");
//                    break;
//                case (4):
//                    System.out.print("four ");
//                    break;
//                case (5):
//                    System.out.print("five ");
//                    break;
//                case (6):
//                    System.out.print("six ");
//                    break;
//                case (7):
//                    System.out.print("seven ");
//                    break;
//                case (8):
//                    System.out.print("eight ");
//                    break;
//                case (9):
//                    System.out.print("nine ");
//                    break;}
//        }
        //6
//        Scanner scan = new Scanner(System.in);
//        double x,y, x0,y0,r;
//        x = scan.nextDouble();
//        y = scan.nextDouble();
//        x0 = scan.nextDouble();
//        y0 = scan.nextDouble();
//        r = scan.nextDouble();
//        if(Math.pow(x-x0, 2)+Math.pow(y-y0, 2)<=Math.pow(r, 2)){
//            System.out.println("True");
//        }
//        else {
//            System.out.println("False");
//
//        }
        //7a
//        Scanner scan = new Scanner(System.in);
//        int a, f, s, t;
//        a = scan.nextInt();
//        f = a / 100;
//        s = a / 10 % 10;
//        t = a % 10;
//        if (Math.pow(a, 2) == Math.pow(f + s + t, 3)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        7b
//        Scanner scan = new Scanner(System.in);
//        int a, f, s, t, fo;
//        a = scan.nextInt();
//        f = a / 1000;
//        s = a / 100 % 10;
//        t = a /10% 10;
//        fo = a % 10;
//        if (f+s == t+fo) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        7c
//        Scanner scan = new Scanner(System.in);
//        int a, f, s, t;
//        a = scan.nextInt();
//        f = a / 100;
//        s = a / 10 % 10;
//        t = a % 10;
//        if (f==s|| f==t||s==t) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }
//        7d
        Scanner scan = new Scanner(System.in);
        double a,f, s, t;
        a = scan.nextDouble();
        f = a * 10 % 10;
        f=(int)f;
        s = a % 0.1*100;
        s=(int)s;
        t = a % 0.01*1000;
        t=(int)t;
        if (f==0|| s==0||t==0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
