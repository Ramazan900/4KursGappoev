/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 02
 */

import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        for (int i = (((k - 1) / 3) + 1) * 3; i <= m; i += 3) {
            System.out.println(i);
        }
    }
}
