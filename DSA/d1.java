import java.util.*;

public class d1 {
    static node head;

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // TO INPUT IN THE LEFT SIDE OF THE HEAD
    public void input(int d) {
        node temp = new node(d);
        temp.next = head;
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

    }

    // TO INPUT AT ANY POSITION -----------D3-----------
    public void input3(int pos, int val) {
        node temp = new node(val);
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            node temp2 = head;

            for (int i = 1; i < pos - 1; i++) {
                temp2 = temp2.next;
            }
            node temp3 = temp2.next;
            temp2.next = temp;
            temp.next = temp3;
        }

    }// DELETING THE HEAD NODE

    public void del() {
        if (head == null)
            System.out.println("Empty/null list ");
        else {
            node temp = head;
            head = head.next;
            temp.next = null;
            System.out.println("The deleted node is----> " + temp);
        }
    }// DELETING THE LAST NODE

    public void del2() {
        if (head == null)
            System.out.println("Empty list");
        else if (head.next == null)
            head = null;
        else {
            node temp2 = null;
            for (node temp = head; temp.next != null; temp = temp.next) {
                temp2 = temp;

            }
            temp2.next = null;
            System.out.println("the deleted node is----> " + temp2);
        }
    }// Deleting at any position

    public void del3(int pos) {
        node temp = head;
        node temp2 = null;
        if (head == null)
            System.out.println("Empty list");
        else if (pos == 1)
            head = head.next;
        else {
            for (int i = 1; i < pos - 1; i++) {
                temp2 = temp;
                temp = temp.next;
            }
            temp = temp.next;
            temp2.next = temp;
        }
        System.out.println("The given node at position     -------->     " + pos + "Is deleted ");
    }

    // REVERSING A Linked List --------------------D4------------------------
    public node reverse(node head) {
        node temp = head;
        node temp2 = null;
        node temp3 = null;
        while (temp != null) {
            temp3 = temp.next;
            temp.next = temp2;
            temp2 = temp;
            temp = temp3;
        }
        return temp2;
    }

    // Find middle element of a Linked list .
    public void mid(node head) {
        node temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;

        }
        for (int i = 0; i <= c / 2; i++)
            temp = temp.next;

        System.out.println("The middle node is >>>    " + temp);

    }

    // Find nth node from the end of the Linked list.
    public void search(node head, int n) {
        node temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;

        }
        temp = head;
        for (int i = 1; i <= c - n; i++) {

            temp = temp.next;

        }
        System.out.println("The searched node is >>    " + temp);
    }

    // Deleting the duplicate node from the Linked list .-------D5----------

    public void duplicate(node head) {
        node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
    }

    // DELETING DUPLICATE NODE AT ANY POSITION
    public void dup(node head) {
        node temp = head;
        node temp2;
        while (temp != null && temp.next != null) {
            temp2 = temp;
            while (temp2.next != null) {
                if (temp.data == temp2.next.data)
                temp2.next = temp2.next.next;
              else  temp2 = temp2.next;
            }
            temp = temp.next;
           

        }
    }
    //Floyd's Loop Detection 


    public void detectLoop(node head)
    {
        node f=head;
        node s=head;
        node temp=head;
        int c=0;
        while(f!=null &&f.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            {
            c=1;
                System.out.println("Loop detected!\n");
                break;
            }
        
        }
        if(c==1)
        {
            if (s == temp)
                System.out.println("Loop starts at element >>   " + temp.data);

while(s.next!=temp.next){
    s=s.next;
    temp=temp.next;
    
}
if (s.next == temp.next)
    System.out.println("Loop starts at element >>   " + temp.next.data);
System.out.println("Do you want to remove the loop? 1 for yes, 0 for no\n");
Scanner kb=new Scanner(System.in);
int w=kb.nextInt();
kb.close();
if(w==1){
s.next=null;
}



        }

        else System.out.println("No loop detected");

        
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

    public static void main(String[] args) {
        d1 obj = new d1();

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
        System.out.println("Do you want to add more nodes to the list?  1 for yes 0 for no");
        int a1 = sc.nextInt();
        if (a1 == 1) {

            System.out.println("Enter the node and Where do you want to add the node ?");
            int val = sc.nextInt();
            int pos = sc.nextInt();
            obj.input3(pos, val);
        }
        obj.display();
        System.out.println(
                "\nEnter 1 to delete the head node , 2 to delete the last node , 3 to delete any node ,type anything else to exit");
        int d1 = sc.nextInt();
        if (d1 == 1)
            obj.del();
        if (d1 == 2)
            obj.del2();
        if (d1 == 3) {
            System.out.println("\nEnter the position which you want to delete");
            int pos2 = sc.nextInt();
            obj.del3(pos2);
        }
        System.out.println("\nDo you want to reverse the nodes ? 1 for yes ,type anything else to exit");
        int k4 = sc.nextInt();
        if (k4 == 1) {
            System.out.println(" \nBefore reversing>>>\n");
            obj.display();
            head = obj.reverse(head);
            System.out.println("\nAfter reversing>>>\n");
            obj.display();
        }
        System.out.println("\nDo you want to see only the middle node ? 1 for yes ,type anything else to exit");
        int k5 = sc.nextInt();
        if (k5 == 1)
            obj.mid(head);
        System.out.println("Do you want to search for any node ? 1 for yes,type anything else to exit");
        int k1 = sc.nextInt();
        if (k1 == 1) {
            System.out.println("Enter the position of the node to search from the last");
            int k2 = sc.nextInt();
            obj.search(head, k2);
        }
        System.out.println("Do you want to delete consecutive duplicate nodes? 1 for yes,type anything else to exit");
        int k3 = sc.nextInt();
        if (k3 == 1) {
            obj.duplicate(head);
            obj.display();
        }
        System.out.println("Do you want to delete any dupicate node ? 1 for yes ,type anything else to exit");
        int k6= sc.nextInt();
        if (k6 == 1) {
           obj.dup(head);
            obj.display();
        }
        System.out.println("Do you want to create any loop ? 1 for yes ,type anything else to exit");
        int k8 = sc.nextInt();
        if(k8 == 1)
        {
        System.out.println("Enter the position at which you want to start the loop at ");
        int pos = sc.nextInt();
        node t3 = head;
        node t4 = head;
        while (t3.next != null)
            t3 = t3.next;
        for (int i = 1; i <pos;i++)
            t4 = t4.next;
        t3.next = t4;
    }
        System.out.println("Do you want to detect for any loop? 1 for yes ,type anything else to exit");
        int k7= sc.nextInt();
        if(k7 == 1){
            
            obj.detectLoop(head);
        }
obj.display();
        sc.close();
    }
}