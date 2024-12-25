/*import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
    
   /*for(int i=0;i<=list.size()-1;i++){
sc.(list.add(i));*/
    
   /*list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
        list.add(5);
   for(int j=0;j<=list.size()-1;j++){
        System.out.println("Enter your number ="+list.get(j));
            }list.remove(2);
            for(int j=0;j<=list.size()-1;j++){
                System.out.println("Enter your number ="+list.get(j));
                    }
                    list.set(2, 6);
                    for(int j=0;j<=list.size()-1;j++){
                        System.out.println("Enter your number ="+list.get(j));
                            }
}
}*/
import java.util.*;
public class Arraylist {
    public static void reverse (ArrayList<Integer> limb ){
        for(int i=limb.size()-1;i>=0;i--){
            System.out.print(limb.get(i)+" ");
        }
System.out.println();
    }
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(6);
    list.add(9);
    list.add(8);
    reverse(list);
}
    
}