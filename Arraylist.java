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
    public static void maxnum(ArrayList<Integer> lift){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lift.size();i++){
            if(max<lift.get(i)){
                max=lift.get(i);
            }
        }
        System.out.println("max element="+max);
    }
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(8);
    list.add(3);
    list.add(2);
    list.add(7);
    list.add(5);
    reverse(list);
    maxnum(list);
}
    
}