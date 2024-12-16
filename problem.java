import java.util.Scanner;
public class problem {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
float number = sc.nextFloat();
System.out.println("enter the number"+ number);
float number2= sc.nextFloat();
System.out.println("enter the number2"+ number2);
System.out.println("sum of the number"+ (number+number2));
System.out.println("product of the number"+ (number*number2));
System.out.println("enter the radius value");
float radius=sc.nextFloat();
System.out.println("enter the number" + (3.14*radius*radius));
sc.close();
 }
    
}
    

