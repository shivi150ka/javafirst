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