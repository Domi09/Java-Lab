import java.util.*;

public class doublylinkedlist{
    static node head;
    static node tail;

    static class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.prev=null;
        }
    }
    
    // TO INPUT IN THE LEFT SIDE OF THE HEAD
    public void input(int d) {
        node temp = new node(d);
        if (head == null) {
            head = temp;
            tail=temp;
            return;
        }
        temp.next = head;
        head.prev=temp;
        head = temp;


    }

    // TO INPUT IN THE RIGHT SIDE OF THE HEAD
    public void input2(int d) {
        node temp = new node(d);
        if (head == null) {
            head = temp;
            return;
        }
        node n2 = head;
        while (n2.next != null) {
            
            n2 = n2.next;
        }

        n2.next = temp;
        n2.next.prev = n2;
        tail=temp;

    }
    // display
    public void display() {
        node n = head;
        while (n != null) {
            System.out.print(n.data + "--->  ");
            n = n.next;
        }
        System.out.print("null");

    }
    public int isEmpty() {
        if(head == null && tail == null) {
    return 1;
        }
        else
        return 0;
    }
    //Length 
    public int length() {
        node temp = head;
        int c=0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    
    //Inserting a node
    public void insert(int pos, int val)
    {
        int len = length();
        node temp = new node(val);
if(pos>len){
    System.out.println("Position exceeds length");
    return;
}
node t1= head;
node t2= head;

for(int i=1; i<pos-1; i++){
    t2=t2.next;
    t1=t1.next;
}
t2=t2.next;
t1.next=temp;
temp.next=t2;


    } 
    //Deleting any node
    public void del(int pos){
        int len = length();
        if (pos > len) {
            System.out.println("Position exceeds length");
            return;
        }
        node t1=head;
        node t2=head;
        for(int i=1; i<pos-1; i++){
            t1=t1.next;
            t2=t2.next;
        }
        t2=t2.next.next;
        t1.next=t2;



    }

    
    public static void main(String[] args) {
        doublylinkedlist obj = new doublylinkedlist();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes ");
        int j = sc.nextInt();
        int k = 0;
        System.out.println("In which side of the head you want to add the data 0 for left , 1 for right");
        int c = sc.nextInt();
        System.out.println("Enter the nodes ");
        for (int i = 0; i < j; i++) {
            k = sc.nextInt();
            if (c == 0)
                obj.input(k); // TO INPUT AT THE LEFT SIDE OF THE HEAD
            else
                obj.input2(k);// TO INPUT AT THE RIGHT SIDE OF THE HEAD
        }
    
        System.out.println("\nDo you want to add the node 1 for yes anything else for no\n");
        int a2=sc.nextInt();
        if (a2 ==1){
           System.out.println("\nWhere do you want to add the node ? ");
            int a3=sc.nextInt();
            System.out.println("Enter the value of the node");
            int a4=sc.nextInt();
            obj.insert(a3,a4);
            obj.display();
        }
        System.out.println("\n Do you want to delelte any node ? 1 for yes anything else for no");
        int a5=sc.nextInt();
        if(a5 ==1){
            System.out.println("\n Enter the position of the node you want to delete");
            int a6=sc.nextInt();
            obj.del(a6);
        }


        obj.display();
        sc.close();
} 
}