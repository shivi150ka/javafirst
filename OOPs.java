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
    /*public class OOPs {
    
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
            }*/
         /*   public class OOPs {
            public static void main(String[] args) {
                
            
           Bankaccount p1 = new Bankaccount();
         p1.setaccount(4851);
            System.out.println(p1.Account_Number);

            p1.setpassword('a');
System.out.println(p1.Password);
           } }
        class Bankaccount{
            int Account_Number;
            char Password;
void setaccount(int num){
    Account_Number= num;
}
void setpassword(char newpass){
    Password= newpass;
}
        }*/
      /* *  public class OOPs {
        public static void main(String[] args) {
            jacket j1 = new jacket();
            j1.color="pink";
            j1.numofpacket=50;
            System.out.println(j1.color);
            System.out.println(j1.numofpacket);
            j1.setpacket(55);
            j1.setcolour("Blue");
            System.out.println(j1.color);
            System.out.println(j1.numofpacket);
        }
            
        }
    class jacket{
        int numofpacket;
String color;
void setpacket(int number){
    numofpacket=number;
}
void setcolour( String newcolour){
    color= newcolour;
}
    }*/
    public class OOPs {
    
        public static void main(String[] args) {
            blanket b1= new blanket();
            b1.setcolor("blue");
            System.out.println(b1.getcolor());
             
        }
    }

class blanket{
    String color;
    int thickness;
    String getcolor(){
        return this.color;
    }
    int getthickness(){
        return this.thickness;
    }
void setcolor(String newcolor){
    this.color=newcolor;
}
void setthickness(int newvalue){
    this.thickness=newvalue;
}
}