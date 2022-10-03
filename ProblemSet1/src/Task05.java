/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 05
 */

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        int q,w;
        q = n % 10;
        n = n / 10;
        int length = String.valueOf(n).length();

        for (int i = 0; i <= length; i++) {
            w = n % 10;
            a = 2*a;
            b += w * a;
            n = n / 10;
        }
        System.out.println(b+q);
    }
}