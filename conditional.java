/*import java.util.Scanner;
public class conditional {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
     System.out.println("Enter your age");
     int age = sc.nextInt();
     System.out.println(age  );
     if(age>=18){
        System.out.println("You are eligible for voting");
     }
     else{
        System.out.println("You are not an adult");
     }
     sc.close();
}
}*/
/*import java.util.Scanner;
public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number=");
        float num1 = sc.nextFloat();
        System.out.println(num1);
        System.out.print("Enter the second number=");
        float num2 = sc.nextFloat();
        System.out.println(num2);
        if(num1>num2)
        System.err.println("num1 is greater than num2");
        else
        System.out.println("num2 is greater than num1");
        sc.close();
    }
}*/
import java.util.Scanner;
public class conditional {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number =");
    int num = sc.nextInt();
    System.out.println("your number is " +num);
    if(num%2==0)
    {
        System.err.println("your number is even");
    }
else{
    System.out.println("your number is not an even");
}
sc.close();
 }
    
}
