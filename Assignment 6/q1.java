import java.util.*;

public class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total weight in gram: ");
        int weight;
        weight = sc.nextInt();
        System.out.println("Total weight before organising is" + weight);
        int kg5 = 0, kg2 = 0, kg1 = 0, g500 = 0, g200 = 0, g100 = 0, g50 = 0, g25 = 0, g10 = 0;

        if (weight >= 5000)
            kg5 = weight / 5000;
        weight = weight % 5000;
        if (weight >= 2000)
            kg2 = weight / 2000;
        weight = weight % 2000;
        if (weight >= 1000)
            kg1 = weight / 1000;
        weight = weight % 1000;
        if (weight >= 500)
            g500 = weight / 500;
        weight = weight % 500;
        if (weight >= 200)
            g200 = weight / 200;
        weight = weight % 200;
        if (weight >= 100)
            g100 = weight / 100;
        weight = weight % 100;
        if (weight >= 50)
            g50 = weight / 50;
        weight = weight % 50;
        if (weight >= 25)
            g25 = weight / 25;
        weight = weight % 25;
        if (weight >= 10)
            g10 = weight / 10;
        weight = weight % 10;
        System.out.println("This consists of -----" + kg5 + "-----5kg-----" + kg2 + "-----2kgs-----" + kg1
                + "-----1kgs-----" + g500 + "-----500 gms-----" + g200 + "-----200g-----" + g100 + "-----100g-----"
                + g50 + "-----50g-----" + g25 + "-----25g-----" + g10 + "-----10g-----" + weight
                + "-----remaining weight in g-----");
        sc.close();

    }
}