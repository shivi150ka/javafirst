public class queue {
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
    }
     public static void main(String[] args) {
        queu q= new queu(4);
       System.out.print(q.add(1));
      /*   q.add(2);
        q.add(3);
        q.add(4);*/
        System.out.print(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));

     }
}
