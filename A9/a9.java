/*Assignment -9
23-08-2021
(Multi Dimension Array)
Q1. WAP.in Java to create a class TwoDimArray:
Members of the above class are:
1) One 2D array (3X n) and three 1D arrays.
2) Input the column size(n) and allocate memory of size (3 X n) for the array and
input data into the Array.
3) Display the array elements in row wise.
4) Display the array elements in column wise.
5) Display all 1D arrays.
6) Allocate memory for all 1D arrays as per the column size(n) of 2D array and
copy the numbers row wise from the 2D array to all 1D arrays.
7) Declare two local 1D arrays. Allocate memory as per the requirement. Copy all
two digit numbers to one array and all three digit numbers to another array.
Ignore any other digit numbers. Display the new arrays. */

import java.util.*;

public class a9 {
    public static void main(String args[]) {
        int n = 0, n1 = 0, n2 = 0, n3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of 3 1D arrays");

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        int[] a3 = new int[n3];
        System.out.println("Enter the elements of 1st 1D array-");

        for (int i = 0; i < n1; i++)
            a1[i] = sc.nextInt();
        System.out.println("Enter the elements of 2nd 1D array-");
        for (int i = 0; i < n2; i++)
            a2[i] = sc.nextInt();
        System.out.println("Enter the elements of 3rd 1D array-");

        for (int i = 0; i < n3; i++)
            a3[i] = sc.nextInt();
        System.out.println("Enter the column size of 2D Array-");
        n = sc.nextInt();
        int[][] ar = new int[3][n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the numbers at position    " + i + "   X   " + j);
                ar[i][j] = sc.nextInt();

            }

        } // ROW WISE PRINT
        System.out.println("Value row wise>>   ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(ar[i][j] + "  ");

            }
        }
        // COLUMN WISE PRINT
        System.out.println("Value column wise>>   ");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(ar[i][j] + "  ");

            }
        }
        // Matrix
        System.out.println("\nMatrix wise array representation>>>");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + "  ");
            }
            System.out.println(" ");
        }
        // PRINTING THE 1D arrays
        System.out.println("The elements of 1st 1D array are ->    " + Arrays.toString(a1));
        System.out.println("The elements of 2nd 1D array are ->    " + Arrays.toString(a2));
        System.out.println("The elements of 3rd 1D array are ->    " + Arrays.toString(a3));
        a1 = null;
        a2 = null;
        a3 = null;
        a1 = new int[n];
        a2 = new int[n];
        a3 = new int[n];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    a1[j] = ar[i][j];
                }
                if (i == 1) {
                    a2[j] = ar[i][j];
                }
                if (i == 2) {
                    a3[j] = ar[i][j];
                }
            }
        }
        // New counter x1 and x2 taken as limit for even and odd arrays[d2,d3] later
        int x1 = 0, x2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i][j] > 9 && ar[i][j] < 100) {
                    x1++;
                }
                if (ar[i][j] > 99 && ar[i][j] < 1000) {
                    x2++;
                }

            }
        } // Limits set in and new values extracted and  stored from previous arrays (odd and even separately)
        int[] d2 = new int[x1];
        int[] d3 = new int[x2];
        int y1 = 0, y2 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {

                if (ar[i][j] > 9 && ar[i][j] < 100) {
                    d2[y1] = ar[i][j];
                    y1++;
                } else if (ar[i][j] > 99 && ar[i][j] < 1000) {
                    d2[y2] = ar[i][j];
                    y2++;
                }

            }
        }

        System.out.println("The array with 2 digit elements >>    " + Arrays.toString(d2));
        System.out.println("The array with 3 digit elements >>    " + Arrays.toString(d3));
        sc.close();
    }// main

}// class
