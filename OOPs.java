public class OOPs {
    public static void main(String[] args) {
        pen p1 = new pen ();
        p1.setcolor("Blue");
        System.out.println(p1.color);}}
    class pen{
        String color ;
        int tip;
        void setcolor (String newcolor){
            color = newcolor;
        }
        void setip(int newtip){
            tip=newtip;
        }
    }
    

