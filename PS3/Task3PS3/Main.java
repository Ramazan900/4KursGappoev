package Task3PS3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SimpleLongNumber");
        System.out.println("первое число");
        long b = sc.nextInt();
        Number a = new SimpleLongNumber(b);
        System.out.println("второе число");
        long b1 = sc.nextInt();
        Number a1 = new SimpleLongNumber(b1);
        System.out.println("сумма SimpleLongNumber");
        System.out.println(a.add(a1));
        System.out.println("разность SimpleLongNumber");
        System.out.println(a.sub(a1));
        System.out.println("сравнение SimpleLongNumber");
        System.out.println(a.compareTo(a1));
        System.out.println("VeryLongNumber");
        System.out.println("первое число");
        String c = sc.next();
        Number x = new VeryLongNumber(c);
        System.out.println("второе число");
        String c1 = sc.next();
        Number x1 = new VeryLongNumber(c1);
        System.out.println("сумма VeryLongNumber");
        System.out.println(x.add(x1));
        System.out.println("разность VeryLongNumber");
        System.out.println(x.sub(x1));
        System.out.println("cравнение VeryLongNumber");
        System.out.println(x.compareTo(x1));
        System.out.println("Simple+Long");
        System.out.println(a.add(x));
    }
}