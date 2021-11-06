
/* JAGGED ARRAY
Q1. A student is appearing  different entrance examinations and
wants to store his scores in one array. The number of sections is
different in different entrance examinations. 
Entrance1 has 4sections,
Entrance2 has 2 sections
Entrance3 hal 6 sections,
Entrance4 has 5 sections
Entrance5 has 3 sections
Allocate
appropriate memory to store all results properly.
Design a class JaggedArray with following members:
a) One Array to hold the scores of all the entrance examinations.
b) Allocate memory for the Array exactly as the no of sections
specified in each entrance examination.
c) Input scores in different sections for all the five entrance
examinations.
d) Show the scores row-wise with entrance name at the beginning.
e) Show the total marks scored in each entrance.
f) Count the scores which are more than 80 separately for each
entrance.
g) Show the scores which are less than 50(below qualifying mark)
for more preparation.
 */
import java.util.*;

public class q10 {
    public static void main(String args[]) {

        // Q aand Q b
        int[][] ar = new int[5][];
        ar[0] = new int[4];
        ar[1] = new int[2];
        ar[2] = new int[6];
        ar[3] = new int[5];
        ar[4] = new int[3];
        // Q.C
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            // satya's big brain
            int k = 0;
            if (i == 0)
                k = 4;
            if (i == 1)
                k = 2;
            if (i == 2)
                k = 6;
            if (i == 3)
                k = 5;
            if (i == 4)
                k = 3;
            System.out.println(
                    "Enter the marks for the    " + (i + 1) + "th  Entrance which has   " + (k) + "    Sections");
            for (int j = 0; j < k; j++) {

                ar[i][j] = sc.nextInt();

            }
        }
        sc.close();
        // Q.D
        for (int i = 0; i < 5; i++) {
            int k = 0;
            if (i == 0)
                k = 4;
            if (i == 1)
                k = 2;
            if (i == 2)
                k = 6;
            if (i == 3)
                k = 5;
            if (i == 4)
                k = 3;
            System.out.println("The scores for the    " + (i + 1) + "  th  Entrance are ");
            for (int j = 0; j < k; j++)
                System.out.print("  " + ar[i][j]);
        }
        // Q.E
        for (int i = 0; i < 5; i++) {
            int k = 0;
            if (i == 0)
                k = 4;
            if (i == 1)
                k = 2;
            if (i == 2)
                k = 6;
            if (i == 3)
                k = 5;
            if (i == 4)
                k = 3;

            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += ar[i][j];

            }
            System.out.println("The total scores for the    " + (i + 1) + "  th  Entrance is  " + sum);
            System.out.println("  ");

        }
        // Q.F
        for (int i = 0; i < 5; i++) {
            int k = 0;
            if (i == 0)
                k = 4;
            if (i == 1)
                k = 2;
            if (i == 2)
                k = 6;
            if (i == 3)
                k = 5;
            if (i == 4)
                k = 3;

            int c = 0;
            for (int j = 0; j < k; j++) {
                if (ar[i][j] > 80)
                    c++;

            }
            System.out.println("Total 80 plus marks  in entrance:   " + (i + 1) + "   is   " + c);
        }
        // Q.G
        for (int i = 0; i < 5; i++) {
            int k = 0;
            if (i == 0)
                k = 4;
            if (i == 1)
                k = 2;
            if (i == 2)
                k = 6;
            if (i == 3)
                k = 5;
            if (i == 4)
                k = 3;
            System.out.println("Total marks which are below 50   in entrance:   " + (i + 1) + " are  >>  ");
            for (int j = 0; j < k; j++) {
                if (ar[i][j] < 50)
                    System.out.print(ar[i][j] + "   ");

            }
            System.out.println(" ");

        }

    }// main

}// class
