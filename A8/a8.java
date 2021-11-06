
/*Q1. WAP to create a class Array having member variables as an integer array 
and it’s size. 
Design methods to perform the following operations on the array:
1) Input the size of the array and allocate memory for the Array as per the size 
specified. Then input required elements for the array.
2) To display the array elements.
3) Calculate sum and average of elements.
4) Swap the max and min elements.
5) Find the occurrence of different elements.
6) Reverse each element of the array and store them in another array.
7) Show which array contains the biggest number.
8) Check which array contains more even numbers and more odd numbers.
*/
import java.util.*;

public class a8 {
    public static void main(String args[]) {
        a8 obj = new a8();
        int[] ar = obj.array();
        obj.display(ar);
        obj.calc(ar);
        obj.swap(ar);
        obj.count(ar);
        int[] re = obj.reverse(ar);
        obj.biggest(ar, re);
        obj.oddeven(ar, re);

    }

    int[] array() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array limit");
        i = sc.nextInt();
        int[] arr = new int[i];
        System.out.println("Enter the array elements");
        for (int j = 0; j < arr.length; j++)
            arr[j] = sc.nextInt();
        sc.close();

        return arr;

    }

    void display(int[] ar2) {
        System.out.println("The array elements are->  " + Arrays.toString(ar2));

    }

    void calc(int[] ar) {
        int sum = 0, avg = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        avg = sum / ar.length;
        System.out.println("The sum is " + sum + "\nThe average is " + avg);
    }

    void swap(int[] ar) {
        int max = 0, min = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i == 0) {
                max = ar[0];
                min = ar[0];
            }
            if (ar[i] > max)
                max = ar[i];
            if (ar[i] < min)
                min = ar[i];

        }
        System.out.println("The maximum is " + max + "\nThe minimum is " + min);
        int temp = max;
        max = min;
        min = temp;
        System.out.println("After swapping\n Max is  " + max + "   and Min is  " + min);

    }

    void count(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int c = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j])
                    c++;
            }
            System.out.println("The element  " + ar[i] + "  Has occured  " + c + "  Times");
        }

    }

    int[] reverse(int[] ar) {
        int[] rev = new int[ar.length];
        int a, b, c, j = 0;
        for (int i = 0; i < ar.length; i++, j++) {
            a = ar[i];
            c = 0;
            while (a != 0) {
                b = a % 10;
                c = c * 10 + b;
                a /= 10;
            }
            rev[j] = c;
        }
        System.out.println("Array elements before reversing are" + Arrays.toString(ar));
        System.out.println("Array elements after reversing are" + Arrays.toString(rev));
        return rev;
    }

    void biggest(int[] ar, int[] re) {
        int max = 0, max2 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max)
                max = ar[i];
        }
        for (int j = 0; j < re.length; j++) {

            if (ar[j] > max2)
                max2 = re[j];
        }
        if (max > max2)
            System.out.println("The biggest element is  " + max + "  Present in" + Arrays.toString(ar));
        else if (max2 > max)
            System.out.println("The biggest element is  " + max2 + "  Present in" + Arrays.toString(re));
        else
            System.out.println("The biggest element is    " + max + "    and is present in both the arrays"
                    + Arrays.toString(ar) + Arrays.toString(re));

    }

    void oddeven(int[] ar, int[] re) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0)
                c1++;
            if (ar[i] % 2 != 0)
                c2++;
        }
        for (int i = 0; i < re.length; i++) {
            if (re[i] % 2 == 0)
                c3++;
            if (re[i] % 2 != 0)
                c4++;
        }
        if (c1 > c3)
            System.out.println("The array  " + Arrays.toString(ar) + "Contains more even numbers(Total) >>  " + c1);
        else
            System.out.println("The array  " + Arrays.toString(re) + "Contains more even numbers(Total) >>  " + c3);
        if (c2 > c4)
            System.out.println("The array  " + Arrays.toString(ar) + "Contains more Odd numbers(Total) >>  " + c2);
        else
            System.out.println("The array  " + Arrays.toString(re) + "Contains more Odd numbers(Total) >>  " + c4);
    }

}
