import java.util.*;
public class q {
  private static  node  front;
    private static node rear;
    private static  int length;
    static class node{
        private int data;
        private  node next;
        public node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static void input(int k1){
    Scanner kb= new Scanner(System.in);
    int d;
    System.out.println("Enter the data");
    for(int i=1;i<=k1;i++)
    {
    d =kb.nextInt();
    node temp = new node(d);


if(front==null){
front=temp;
}
else{
    rear.next=temp;
}
rear=temp;
length++;

    }
    kb.close();
    }
    static void delete(){
        if(front==null){
            System.out.println("Queue is empty");
        }
        else 
        front=front.next;
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("How many data do you want to enter?");
        int k1=sc.nextInt();
        if(k1 !=0)
        input(k1);
        System.out.println(length);
        System.out.println("Do you want to delete node ? 1 for yes anything else for no;");
        int k2 = sc.nextInt();
        if(k2 !=0)
        delete();
        System.out.println(length);
    


        sc.close();

    }
}
