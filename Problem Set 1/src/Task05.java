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
        int m = n;
        int a = 0;

        if (n > 1) {
            for (int i = 0; Math.pow(10, i) <= n && 1 + Math.pow(10, i) <= n; i++) {
                if (m % 2 == 1) {
                    a += 1 * Math.pow(2, i);
                    m = m / 10;
                } else {
                    m = m / 10;
                }
            }
            System.out.print(a);
        } else if (n == 1) {
            System.out.print(1);
        } else if (n == 0) {
            System.out.print(0);
        }
    }
}
