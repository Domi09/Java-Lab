import java.util.*;

public class q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int roll;
        String name;
        int[] marks = new int[5];

        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your roll number");
        roll = sc.nextInt();
        System.out.println("Enter your marks in Maths,Phy,Chem,Bio,History");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        int percent;
        percent = (sum) * 100 / 500;
        System.out.println("Name is " + name + "Roll is" + roll + "percent is " + percent);
        if (percent >= 90)
            System.out.println("Your grade is A and percent is " + percent);
        else if (percent >= 80 && percent < 90)
            System.out.println("Your grade is B and percent is " + percent);
        else if (percent >= 70 && percent < 80)
            System.out.println("Your grade is C and percent is " + percent);
        else if (percent >= 60 && percent < 70)
            System.out.println("Your grade is D and percent is " + percent);
        else if (percent >= 50 && percent < 60)
            System.out.println("Your grade is F and percent is " + percent);
        else
            System.out.println("Your grade is Fail");
        sc.close();
    }
}
