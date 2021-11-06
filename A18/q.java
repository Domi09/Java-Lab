
import java.util.*;
public  class q{
    interface IntProperties {
        void positiveCheck(int a);
        void primeCheck(int a);
        void palindromeCheck(int a);
        void evenCheck(int a);
    }
interface IntSum{
    void evensum(int a );
    void oddsum(int a );
    void factsum(int a );
}

static class myintoperation implements IntProperties, IntSum {
    private int a;
    public void positiveCheck(int a){

        if(a>=0)
        System.out.println("Postiive number");
        else
        System.out.println("Negative number");

    }

    public void primeCheck(int a){
for(int i=2;i<a/2;i++){
    if(a%i==0)
    {
        System.out.println("Not a Prime number");
        return;
    }

}
System.out.println("Prime number");
    }

    public void palindromeCheck(int a){
        int rev=0;
        int r;
        int b = a;
        while(b!=0){
        r=b%10;
        rev=(rev*10)+r;
        b/=10;
        }
        if(a==rev)
        System.out.println("Palindrone Number");
        else
        System.out.println("Not a palindrome number");

    }

    public void evenCheck(int a){
if(a%2==0)
System.out.println("Even Number");
else
System.out.println("Odd Number");
    }

   public  void evensum(int a){
       int sum = 0;
       int r;
       int b = a;
       while (b != 0) {
           r = b % 10;
    if(r%2==0)
    sum += r;
           b /= 10;
       }
       System.out.println("The sum of even digits of the number is " + sum);

    }

   public  void oddsum(int a) {
       int sum = 0;
       int r;
       int b = a;
       while (b != 0) {
           r = b % 10;
           if (r % 2 != 0)
               sum += r;
           b /= 10;
       }
       System.out.println("The sum of odd digits of the number is " + sum);

    }

    public void factsum(int a){
       int sum=0;
       int digit;
       int a2=a;
       while(a2>0)
       {
digit=a2%10;
int fact=1;
for(int i=1;i<=digit;i++){
fact=fact*i;
}
sum=sum+fact;
a2=a2/10;
       }
       System.out.println("Sum of the factorial of the digits of the number is " + sum);
        }
   

    

   
    myintoperation(int k){
        a=k;
    }


        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to operate on");
        int k=sc.nextInt();
      myintoperation obj = new myintoperation(k);
     obj.positiveCheck(k);
         obj.primeCheck(k);
       obj.palindromeCheck(k);
         obj.evenCheck(k);
        obj.evensum(k);
     obj.oddsum(k);
    obj.factsum(k);


    sc.close();
}
    
}
