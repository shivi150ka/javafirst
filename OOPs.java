/*public class OOPs {
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
    }*/
    /*Access Modifiers
     public class OOPs {
    
        public static void main(String[] args) {
            bankaccount myaccount = new bankaccount();
            myaccount.username = "Shara Khapra";
            myaccount.setpassword ("annu@123");
            System.out.println(myaccount.username);
        }    
    }
    class bankaccount  {
    public String username;
     String password;
    public void setpassword(String pwd){
    password="pws";
    }   
    }*/
    public class OOPs {
    
        public static void main(String[] args) {
            pen p1 = new pen();
            p1.setcolor("Blue");
            System.out.println(p1.getcolor());
            p1.settip(9);
            System.out.println(p1.gettip());
            p1.setcolor("yellow");
            System.out.println(p1.getcolor());  
        }
    }
    class pen {
        private String color;
        private int tip;
        String getcolor(){
            return this.color;}
            int gettip(){
                
                return this.tip;
            }
            void setcolor (String newcolor){
                this.color=newcolor;}
                void settip(int tip){
                    this.tip=tip;
                }
            }
        
    

