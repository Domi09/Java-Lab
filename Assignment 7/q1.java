import java.util.*;

public class q1 {
    public static void main(String args[]) {
        q1 obj = new q1();

        int n = obj.input();
        obj.factorial(n);
        obj.factors(n);
        obj.armstrong(n);

    }

    int input() {
        Scanner kb = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = kb.nextInt();
        kb.close();
        return num;

    }

    void factorial(int n) {
        int fact = 1;
        while (n != 0) {
            fact = fact * n;
            n--;
        }
        System.out.println("The factorial is " + fact);
    }

    void factors(int n) {

        int i = 1;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i + "Is a factor");
        }

    }

    void armstrong(int n) {
        int r;
        int sum = 0;
        int pow;
        while (n != 0) {
            r = n % 10;
            pow = r * r * r;
            sum += pow;
            n = n / 10;
        }
        if (sum == n)
            System.out.println(n + "Is an armstrong number");
        else
            System.out.println("Not an armstrong number");

    }

}
