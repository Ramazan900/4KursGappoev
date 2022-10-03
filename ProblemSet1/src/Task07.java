/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 06
 */

import java.util.Random;
import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Random r = new Random();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = r.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1+=arr[i][arr.length-1-i];
        }
        System.out.println(sum1);
        System.out.println(" ");
        int sum2=0;
        for(int i=0; i< arr.length;i++) {
            sum2 += arr[i][i];
        }
        System.out.println(sum2);
        System.out.println();
        System.out.println("Большая сумма диагоналей - " + Math.max(sum1,sum2));
    }

}