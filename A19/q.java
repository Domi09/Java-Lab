import java.util.*;
import Math.MathOp;
import stats.StatOp;
public class q {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l= sc.nextInt();
int[] a= new int[l];
        System.out.println("Enter the array element-\n");
        for(int i=0; i<l; i++)
        {
         a[i]=sc.nextInt();

        }
        MathOp obj1 = new MathOp();
        StatOp obj2 = new StatOp();
        int maximum=obj1.max(a);
        System.out.println("\nMaximum is \n " + maximum);
        int minimum = obj1.min(a);
        System.out.println("\nMinimum  is \n " + minimum);

      int avg=obj2.average(a);
      System.out.println("\nAverage is \n"+ avg);
      int med= obj2.median(a);
      System.out.println("\nMedian is \n"+ med);


         sc.close();
       
    }
    
}
