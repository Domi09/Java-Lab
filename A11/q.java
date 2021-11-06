/*Assignment-12
06-09-2021
(Array of Objects)
1. Create a class employee having data members emp no,
employee name, category(1 to 5), exp(o to 20) and salary. All
employees are divided into 5 categories and the experience of
an employee may be from 0 to 20 years. Salary will be calculated
by the system by taking 10000 times of category and 500 times
of experience together. Define the following methods.
a) Input emp_no, employee name, category, experience and
calculate salary
b) Print the details of any employee.
c) To get the salary of an employee.
d) To get the experience of an employee.
e) To get the category of an employee.

Create array of objects for six employees and implement the
above methods to perform the following operations in the main
method.
1) Input details of six employees.
2) Display details of all employees.
3) Display the details of the employee getting maximum salary.
4) Count the number of employees working in each category.
5) Calculate the expected salary for those employees who are
working more than 15 years, if their existing salary is increased
by 500 times of their category. Show the new salary along with
their detail information.

*/

import java.util.*;
public class q {
    public static void main(String args[]){
        q obj= new q();
        Employee[] emp = new Employee[6];  
        
            obj.input();        

     for(int i=1;i<=6;i++)
     emp[i].display();





    }
    void input(){
        Employee[] emp = new Employee[6];
        Scanner sc= new Scanner(System.in);
int c1=0,c2=0,c3=0,c4=0,c5=0;
        int eno = 0, cat = 0;
        double sal = 0, xp = 0;
        String name = " ";
        double max=0;
        double sal2=0;
        for (int i = 0; i < 6; i++){
            System.out.println(
                    "Enter the employee details in order of emp no,employee name, category(1 to 5) and exp(o to 20)\n");
            eno = sc.nextInt();
            name = sc.next();
            cat = sc.nextInt();
            xp = sc.nextDouble();
            sal = (10000 * cat) + (500 * xp);            
            emp[i] = new Employee(eno, name, cat, xp, sal);                    
            if (xp >= 15) {
                sal2 = sal + 500 * cat;
                System.out.println("The expected salary of employee no  " + eno + "    is   " + sal2);

            }
            
            if(cat==1)
                c1++;
              else  if(cat==2)
                c2++;
             else   if(cat==3)
                c3++;
              else  if(cat==4)
                c4++;
              else  if (cat == 5)
                c5++;
            
        
            // System.out.println("The salary of this employee is >> "+sal);

        }
        System.out.println("In category 1 , no of employees are >> " + c1);
        System.out.println("In category 2 , no of employees are >> " + c2);
        System.out.println("In category 3 , no of employees are >> " + c3);
        System.out.println("In category 4, no of employees are >> " + c4);
        System.out.println("In category 5, no of employees are >> " + c5);
        for (int j = 0; j < 6; j++){
            if (j == 0)
                System.out.println("Details of employee having Maximum salary >>>\n");
        if (max <= sal) {
            max = sal;
            System.out.println(emp[j]);
        }
        }
      
            sc.close();


    }
    
}
 class Employee {
    public int eno, cat;
    public double sal, xp ;
    public String name;
   Employee(int eno,String name, int cat,double xp,double sal){
       this.eno = eno;
       this.name = name;
       this.cat = cat;
       this.xp = xp;
       this.sal = sal;

   }
   void display(){
       System.out.println("The details are as follows >>>\n"+eno+"\n"+name + "\n"+cat + "\n"+xp + "\n"+sal);

   }

 
}