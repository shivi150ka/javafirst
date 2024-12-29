/*import java.util.Scanner;
public class functions {
public static boolean isPrime(int num){
    if (num==2) {
        return true;
    }
    for (int i=2;i<=Math.sqrt(num); i++){
        if(num%i==0){
            return false;}

        }
return true;}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    int num = sc.nextInt();
    System.out.println("Your number =" + num);
    boolean ans= isPrime(num);
    if (ans==true) {
        System.out.println("Your number is prime");
    }
    else {
        System.out.println("your number is not a prime number");
    }
    sc.close();
}
}*/
// conversion of binary to decimal
/*import java.util.Scanner;
public class functions {
public static void conversion (int a) {
    int n=a;
    int pow=0;
    int decnum =0;
    while(n>0){
  int lastdigit= n%10;
         decnum = decnum+(lastdigit*(int)Math.pow(2,pow));
         pow++;
         n= n/10;

    }
    System.out.println("your answer is"+ decnum);

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversion of Binary to Decimal");
        int num = sc.nextInt();
        System.out.println("your number =" + num);
         conversion(num);
        sc.close();

    }
}*/
/*import java.util.*;
public class functions {
public static boolean isPrime(int num){
if (num==2) {
    return true;   
}
//for(int i=2;i<num-1;i++)
for (int i=2; i<=Math.sqrt(num);i++)
{
    if(num%i==0){
        return false;
    }

}
return true;
}
    public static void main(String[] args) {
        Scanner sc   = new   Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPrime(n));

        sc.close();

    }
}*//*import java.util.*;
public class functions {
    public static void printstar(int num){
        for(int i =1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    printstar(n);

    sc.close();
}
    
}*/
/*import java.util.*;
public class functions {
public static void loop(int n){
   
    for (int i=1;i<=n;i++){
        int c=0;
        for( int j=n;j>=i;j--){
            
            c++;
            System.out.print(c);
           
        }

        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        loop(num);
        sc.close();
    }
}*/







































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
/*import java.util.Scanner;
public class functions {
public static int factorial(int a, int b, int c){
      int root= 1;
      for(int i=1; i<=a;i++)
      {
        root= root*i;
      }
      for(int i=1; i<=b;i++)
      {
        root= root*i;
      }
      for(int i=1; i<=c;i++)
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
        int r= sc.nextInt();
        System.out.println("your r ="+r);
         factorial(num,(num-r),r);
        int ans= num/((num-r)*r);
        System.out.println("your answer ="+ans);
        sc.close();
    }
}*/