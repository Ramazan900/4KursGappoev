/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 03
 */

import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        float l;
        float a = 0;
        for (m = 1; m <= n; m++) {
            l = (float) (m - 1) * (m - 1) / (2 * m);
            a = l + a;
        }
        System.out.println(a);
    }
}