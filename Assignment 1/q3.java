import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String fname = sc.next();
        System.out.println("Enter your last name: ");
        String lname = sc.next();
        System.out.println("Enter your roll number: ");
        int num = sc.nextInt();
        System.out.println("Welcome" + fname + lname + "to Java Programming Language,your roll number is " + num);

    }

}