/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 01
 */

import java.util.Scanner;
public class Task01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int r = 0; r <= n; r++){
            for (int s=0; s < n-r; s++){
                System.out.print("  ");
            }
            for (int s=r; s>0; s--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}