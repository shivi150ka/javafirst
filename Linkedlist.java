/*public class Linkedlist {
    class node{
        int data; 
        node next;
        public node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;

    public void addfirst(int data){
        node newnode=new node(data);
        if (head==null) {
            head=tail=newnode;
            return;
            
        }
        newnode.next=head;
        head= newnode;
    }

public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addfirst(1);
    ll.addfirst(2);
}
}*/
public class Linkedlist {
public static class Node {
int data;
Node next;
public Node(int data){
    this.data=data;
    this.next=null;
}
    
}
public static Node head;
public static Node tail;
    public static void main(String[] args) {
        
    }
}
