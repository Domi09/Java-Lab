import java.util.*;

public class q1 {

    int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    int minus(int a, int b) {
        int diff = 0;
        diff = a - b;
        return diff;
    }

    int divide(int a, int b) {
        int div = 0;
        div = a / b;
        return div;
    }

    int modulus(int a, int b) {
        int mod = 0;
        mod = a % b;
        return mod;
    }

    int rshift(int a, int b) {
        int r = 0;
        r = a >> b;
        return r;
    }

    int lshift(int a, int b) {
        int l = 0;
        l = a << b;
        return l;
    }

    int jod(int a, int b) {
        int j = 0;
        j = a ^ b;
        return j;

    }

    public static void main(String args[]) {
        int num1, num2, y, z, a, b, c, d, e;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the numbers");
        num1 = kb.nextInt();
        num2 = kb.nextInt();
        kb.close();
        q1 x = new q1();
        y = x.sum(num1, num2);
        z = x.minus(num1, num2);
        a = x.rshift(num1, num2);
        b = x.lshift(num1, num2);
        c = x.divide(num1, num2);
        d = x.jod(num1, num2);
        e = x.modulus(num1, num2);
        System.out.println(
                "The numbers are " + num1 + " and " + num2 + "\nSum is " + y + "\nMinus is " + z + "\nrshift is " + a
                        + "\nlshift is " + b + "\ndivision is " + c + "\nModulus is " + e + "\nXOR is" + d);
    }
}
