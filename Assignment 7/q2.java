import java.util.*;

public class q2 {
    public static void main(String args[]) {
        q2 obj = new q2();
        obj.input();

    }

    void input() {
        int s = 0;
        int l = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the  " + (i + 1) + "th  number");

            n = sc.nextInt();
            if (i == 0) {
                l = n;
                s = n;
            }
            if (n > l) {
                l = n;

            }
            if (n < s)
                s = n;
        }
        display(s, l, n);
        sc.close();

    }

    void display(int a, int b, int c) {
        System.out.println("The largest element is" + b + "and the smallest is" + a);
        if (c == b)
            System.out.println("The 10th number is the largest element");
        else if (c == a)
            System.out.println("The 10th number is the smallest");
        else
            System.out.println("The 10th number is  " + (b - c) + "  Smaller than the largest element and\n" + (c - a)
                    + "Larger than the smallest");
    }

}
