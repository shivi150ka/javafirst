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
/*import java.util.Scanner;
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
    
}*/
/*import java.util.Scanner;
public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number=");
        int num1 = sc.nextInt();
        System.out.println("Your first number="+num1);
        System.out.println("Enter your second number=");
        int num2 = sc.nextInt();
        System.out.print("Your first number="+num2);
        System.out.println("Enter your third number=");
        int num3 = sc.nextInt();
        System.out.println("Your third number="+num3);
        if((num1>num2)&&(num1>num3))
        {
            System.out.println("first number is greatest");
        }
        else if ((num2>num1)&&(num2>num3)) {
            System.out.println("second number is greatest");
        }
        else {
            System.out.println("third number is greatest");
        }
        sc.close();
    }
}*/
/*public class conditional {

    public static void main(String[] args) {
        int a=50;
        System.out.println(a);
        int b=40;
        System.out.println(b);
         int greater=(a>b)?a:b;
         System.out.println(greater);
    }
}*/

//why do not run the code using nextLine

import java.util.Scanner;
public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.err.println("Your first operand ="+num1);
        int num2 = sc.nextInt();
        System.err.println("Your second operand ="+num2);
        char operator = sc.next().charAt(0);
        System.out.println(operator);
        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;
                case '-':
                System.out.println(num1-num2);
                break;
                case '*':
                System.out.println(num1*num2);
                break;
                case '/':
                System.out.println(num1/num2);
                break;
                case '%':
                System.out.println(num1%num2);
                break;
            default:
            System.out.println("You have entered an wrong operator");
                break;
        }
sc.close();
    }
}
