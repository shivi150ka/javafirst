/*public class queue {
    static class queu{
        static int arr[];
        static int size;
        static int rear;
        queu(int n){
            arr = new int [n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
     public static void main(String[] args) {
        queu q= new queu(3);
       //System.out.print(q.add(1));
         q.add(2);
        q.add(3);
        q.add(4);
      /*  System.out.print(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
while (! q.isEmpty()) {
    System.out.println(q.peek());
    q.remove();
}
     }
}*/

/*public class queue {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class queue{
        static Node head= null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head == null& tail==null;
        }
        public static void add(int data){
            Node newNode = new Node ();
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        tail=newNode;
    }
}*/

/*import java.util.LinkedList;
import java.util.Queue;
public class queue {
public static void interleave(Queue<Integer> q){
    Queue<Integer>Firsthalf=new LinkedList<>();
    int size=q.size();
    for(int i=0;i<size/2;i++){
        while (!Firsthalf.isEmpty()) {
            q.add(Firsthalf.remove());
            q.add(q.remove());
        }
    }
}
public static void main(String[] args)  {
    Queue<Integer>q=new LinkedList<>();
    q.add(1);
    q.add(2);  q.add(6);
    q.add(3);
    q.add(4);
    q.add(5);
    interleave(q);
    while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");
    }
    System.out.println();
}
}*/
/*import java.util.LinkedList;
import java.util.Queue;
public class queue {
public static void printnonrepeating(String st){
    int freq[]=new int[26];
    Queue<Character> q=new LinkedList<>();
    for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        while (!q.isEmpty()&&freq[q.peek()-'a']>1) {
            q.remove();
        }
        if(q.isEmpty()){
            System.out.print(-1+" ");
        }
        else{
            System.out.print(q.peek()+" ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        String str="uyrsyrtp";
        printnonrepeating(str);
    }
}*/
//Implement stack using Deque

/*import java.util.Deque;
import java.util.LinkedList;
public class queue {
 public static void main(String[] args) {
    Stack s=new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println("peek element is "+s.peek());
    System.out.println(" 1st pop "+s.pop());
    System.out.println("2nd "+s.pop());
    }
}
static class Stack {
Deque<Integer>deque=new LinkedList<>();
public void push(int data){
    deque.addLast(data);
}
  public int pop(){
    return deque.removeLast();
  }  
  public int peek(){
    return deque.getLast();
  }
}*/
//implement queue using deque
import java.util.*;
public class queue {
public static void main(String[] args) {
    queue q= new queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.clone()
    System.out.println("peek"+q.peek());
    System.out.println("peek"+q.remove());
    System.out.println("peek"+q.remove());
    System.out.println("peek"+q.remove());
}
    
}