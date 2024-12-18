import java.util.Scanner;
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
}