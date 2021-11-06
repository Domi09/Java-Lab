import java.util.*;

public class q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 angles of the triangle");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int total = 0;
        total = a1 + a2 + a3;
        if (total != 180)
            System.out.println("Not a valid traingle");
        else if (a1 == 90 || a2 == 90 || a3 == 90)
            System.out.println("Right angle traingle");
        else if (a1 > 90 || a2 > 90 || a3 > 90)
            System.out.println("Obtuse angle traingle");
        else if (a1 < 90 && a2 < 90 && a3 < 90)
            System.out.println("Acute angle traingle");
        sc.close();

    }

}
