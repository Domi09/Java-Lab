import java.util.*;
import java.lang.*;
class invalidAgeException extends Exception {
    public invalidAgeException(String str){
        super(str);
    }
}
public class q1  {
    static void valid(int age) throws invalidAgeException {
        if(age <18 || age > 25){
            throw new invalidAgeException("Not a valid age " );

        }
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the name and age of the student respectively: ");
    String name = sc.next();
    int a = sc.nextInt();
    try{
        valid(a);
   }
    catch(invalidAgeException m){
      System.out.println(""+ m);
    }
}
    
}
