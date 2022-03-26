package hw;

import java.util.Scanner;

public class cycles {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        dz15();

    }
    public static int fact(int a){
        int b = 1;
        if (a==0){
            return 1;
        }
        else {
            for (int i = 1; i<=a; i++){
                b*= i;
            }
        }
        return b;
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
            if (Math.pow(i, 2) < a) {
                val += 1;
            }
        }
        System.out.println(val);
    }

    public static void dz4() {
        int a;
        a = scan.nextInt();

        for (int i = a - 1; i > 0; i--) {
            if (a % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void dz5() {
        int a, b, c;
        c = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        for (int i = a; i < b; i++) {
            if (i % 7 == 0) {
                c += i;

            }
        }
        System.out.println(c);
    }

    public static void dz6() {
        int a, f, s, t;
        a = scan.nextInt();
        f = 1;
        s = 1;
        t = f + s;
        for (int i = 3; i <= a; i++) {
            t = f + s;
            f = s;
            s = t;
        }
        System.out.println(t);

    }

    public static void dz7() {
        int a, b;

        a = scan.nextInt();
        b = scan.nextInt();

        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }

        System.out.println(a + b);
    }

    public static void dz8() {

    }

    public static void dz9() {
        int a, c, d, f;
        a = scan.nextInt();
        d=0;
        f=0;
        do {
            c = a % 10;
            a /= 10;
            if (c%2==0){
                d++;
            }
            else {
                f++;
            }
        }
        while (a != 0);
        System.out.println(d);
        System.out.println(f);

    }
    public static void dz10() {
        int a,c;
        a = scan.nextInt();
        do {
            c = a % 10;
            a /= 10;
            System.out.print(c);
            }
        while (a != 0);
//        String al = "asdfasdf";
//        String bl="";
//        bl+=al.charAt(al.length() -1) ;
//        al=al.substring(0, al.lengthO-1);
//        for(int i=al.length()-1; i>=0; i--){ bl+=al.charAt(i);
    }
    public static void dz11() {
        int a, c, d, f, k;
        a = scan.nextInt();
        d=0;
        f=0;
        for (int i=10;i<a;i++){
            k = i;
            do {
                c = i % 10;
                i /= 10;
                if (c%2==0){
                    d+=c;
                }
                else {
                    f+=c;
                }
            }
            while (i != 0);
            if(d>f){
                System.out.println(k);
            }
            i=k;
            f=0;
            d=0;
        }
    }
    public static void dz12() {
        int a,b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();

        do {
            c = a % 10;
            a /= 10;
            do{
                d = b%10;
                b/=10;
                if(d==c){
                    System.out.println("да");
                    return;
                }
            }while (b!=0);
        }while (a != 0);
        System.out.println("нет");
    }
    public static void dz13() {
        int a;
        double b = 2;
        a = scan.nextInt();
        for (int i = 2;i<a;i++){
            b+= 1+(1/Math.pow(i,2));
        }
        System.out.println(b);
    }

    public static void dz14() {
        int n;
        double x,a,b,c;
        b=0;
        x = scan.nextDouble();
        n = scan.nextInt();
        a = 0;
        c = x;
        for(int i = 1;i<=n;i++){
            a+= 1/c;
            c*=x+i;
        }

        for(int i = 1;i<=n;i++){
            b+= Math.pow(x,i)/fact(i);
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static void dz15(){
        int a;
        double b,c,d;
        b=3;
        c=2;
        a = scan.nextInt();
        for (int i =2;i<a;i++){
            d=(1.0/fact(i));
            b*=(2+d);
        }
        System.out.println(b);
        for (int i =2;i<a;i++){
            c+=((1.0+i)/fact(i));
        }
        System.out.println(c);


    }

    public static void dz19() {
        int a;
        a = scan.nextInt();
        for (int i = 1;i<=Math.sqrt(a);i++){
            for (int j=i; j<=Math.sqrt(a);j++){
                if(Math.pow(i,2)+Math.pow(j,2)==a){
                    System.out.println("да");
                    return;
                }
            }
        }
        System.out.println("нет");
    }

}