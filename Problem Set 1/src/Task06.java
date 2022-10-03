/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 06
 */

import java.util.Scanner;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = sc.nextInt();
        int [] ar= new int[n];

        for(int a=0; a<n ;a++)
        {
            ar[a]= rd.nextInt(10);
            System.out.print(ar[a] + " ");
        }

        System.out.println();

        int [] arr= new int[n];
        int b = n;

        for(int a=0;a<n;a++, b--)
        {
            arr[a]=ar[b-1] ;
            System.out.print(arr[a] + " ");
        }
    }
}
