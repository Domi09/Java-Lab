import java.util.*;

public class q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        int rem = 0;
        int number = 0;
        int rem1;
        for (rem1 = 0; num > 0; num = num / 10) {
            rem1 = num % 10;
            number = number * 10 + rem1;
        }
        while (number != 0) {
            rem = number % 10;
            switch (rem) {
                case 1:
                    System.out.print("One   ");
                    break;
                case 2:
                    System.out.print("Two  ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 0:
                    System.out.print("Zero ");
                    break;
                default:
                    System.out.print("Invalid number");
            }
            number = number / 10;

        }
    }
}
