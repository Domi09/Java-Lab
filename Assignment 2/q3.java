
public class q3 {
    public static void main(String[] args) {
        int salary = 15000;
        double hra = 12;
        double pf = 15;
        double da = 70;
        System.out.println("The gross salary is " + salary);

        double net_salary = salary - ((hra * salary / 100) + (da * salary / 100) + (pf * salary / 100));
        System.out.println("The net salary is " + net_salary);

    }
}