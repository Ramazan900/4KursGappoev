/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 04
 */

import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            a = a * 10;
            a = a + 1;
            sum = sum + a;
        }
        System.out.println(sum);
    }
}