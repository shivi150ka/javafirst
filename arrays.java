import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int [50];
        array[0]=sc.nextInt();
        System.out.println(array[0]);
        System.out.println("length of the array =" +array.length);
sc.close();
    }
}
