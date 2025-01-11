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
/*import java.util.*;
public class Arraylist {
    public static void reverse (ArrayList<Integer> limf ){
        for(int i=limf.size()-1;i>=0;i--){
            System.out.print(limf.get(i)+" ");
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
    public static void swap(ArrayList<Integer> life , int indx1,int indx2){
int temp= life.get(indx1);
life.set(indx1, life.get(indx2));
life.set(indx2, temp);
System.out.println(life);
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
    System.out.println(list);
    int idx=1,idx3=0;
    swap(list, idx, idx3);
}
    
}*/

import java.util.ArrayList;
public class Arraylist {
public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1,9);
    System.out.println();
    list.get(0);
    System.out.println(contains);
}
   
}
