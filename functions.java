/*import java.util.Scanner;
public class functions{
 public static int sum (int a, int b){
int add= a+b;
return add;
 }



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1= sc.nextInt();
    System.out.println("Enter the first number"+num1);
    int num2 = sc.nextInt();
    System.out.println("Enter the first number"+num2);
    int ans = sum(num1,num2);
    System.out.println(ans);
    sc.close();
}
}*/

//to find factorial and binomial coefficient using function
import java.util.Scanner;
public class functions {
public static int factorial(int a){
      int root= 1;
      for(int i=1; i<=a;i++)
      {
        root= root*i;
      }
      return root;
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("factorial calculator");
        int num = sc.nextInt();
        System.out.println("your number ="+ num);
        int ans = factorial(num);
        System.out.println("your answer ="+ans);
        sc.close();
    }
}