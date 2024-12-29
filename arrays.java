/*import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int [50];
        array[0]=sc.nextInt();
        System.out.println(array[0]);
        System.out.println("length of the array =" +array.length);
sc.close();
    }
}*/
import java.util.*;
public class arrays {
public static int largest(int num[]){
    int largest =Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        if (largest<num[i]) {
            largest=num[i];
        }
    }
    return largest;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
      System.out.println("largest number is "+ largest(arr)); 
sc.close();
    }
}
