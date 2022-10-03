import java.util.Random;
import java.util.Scanner;

/**
 * @author Ramazan Gappoev
 * 01-961
 * Problem Set 1 Task 06
 */

import java.util.Random;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();

        int min1 = arr[0] ;
        for(int i = 0; i < n; i++) {
            if (arr[i]< min1)
                min1 = arr[i];
            }
            System.out.println(min1);

        int min2 = arr[0] ;
        for(int i = 0; i < n; i++) {
            if ((arr[i]< min2) && (arr[i] > min1)) {
                min2 = arr[i];
            }
        }
        System.out.println(min2);

        System.out.println(min1+min2);
        System.out.println();


        int max1 = arr[0] ;
        for(int i = 0; i < n; i++) {
            if (arr[i] > max1)
                max1 = arr[i];
        }
        System.out.println(max1);

        int max2 = arr[0] ;
        for(int i = 0; i < n; i++) {
            if ((arr[i] > max2) && (arr[i] < max1)) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);

        System.out.println(max1+max2);





        }

    }
