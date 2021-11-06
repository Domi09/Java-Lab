import java.util.*;

public class q3 {
    public static void main(String args[]) {
        q3 obj = new q3();
        obj.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        sum(n);
    }

    void sum(int num) {
        int r;
        int sum = 0;
        int x = num;

        while (num != 0) {
            r = num % 10;
            sum += r;
            num = num / 10;
        }
        System.out.println("The sum is " + sum);
        check(x, sum);
    }

    void check(int a, int b) {
        int r1, r2, p = 0, d = b;
        while (a != 0) {
            r1 = a % 10;
            int c = 0;
            b = d;
            while (b != 0) {

                r2 = b % 10;
                if (r1 == r2) {
                    c++;
                    p = p * 10 + r1;

                }

                b = b / 10;
            }
            System.out.println("The digit" + r1 + " is common in both" + c + "Times");

            a = a / 10;

        }
        palindrome(p);

    }

    void palindrome(int p1) {
        int rev1 = 0, i = 0, p2 = p1;
        while (p1 != 0) {
            i = p1 % 10;
            rev1 = rev1 * 10 + i;
            p1 /= 10;

        }
        if (p2 == rev1)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome number");

    }

}
