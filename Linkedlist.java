public class Linkedlist {
   

    public void addfirst(int data){
        node newnode=new node(data);
        System.out.println(newnode);
        if (head==null) {
            head=tail=newnode;
            System.out.println(newnode);
            return;
            
        }
        newnode.next=head;
        System.out.println(head);
        System.out.println(newnode.next);
        head= newnode;
        System.out.println(head);
    }

public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    node n = new node(5);
    System.out.println(ll);
    ll.addfirst(1);
    System.out.println(ll);
    ll.addfirst(2);
    System.out.println(ll);
}
}
public class node{
    int data; 
    node next;
    
    public node (int data){
        System.out.println(data);
        this.data=data;
        System.out.println(this.data);
        this.next=null;
        System.out.println(this.next);
        System.out.println(next);
    }
}
public static node head;
public static node tail;
/*public class Linkedlist {
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
public static int size;
public void addfirst(int data){
    Node newNode= new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
public void addlast(int data){
    Node newnNode = new Node(data);
    size++;
    if(head==null){
        head=tail=newnNode;
        return;
    }
    tail.next=newnNode;
    tail=newnNode;
    public void print(){
        Node temp=head;
        while(temp!==null){
            Node temp=head;
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
    public static void main(String[] args) {
        
    }
}*/
