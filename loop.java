import java.util.Scanner;
public class loop{
   public static void diamondpattern(int num){
    for(int i=1;i<=num;i++){
        for(int j=1;j<=num-i;j++)
        {System.out.print(" ");}
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
            
        
        
        System.out.println();
    }
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i-1;j++)
        {System.out.print(" ");}
        for(int k=1;k<=9-2*i;k++){
            System.out.print("*");
        }
            
        
        
        System.out.println();
    }
 }

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n);
    diamondpattern(n);
    
    sc.close();
}

}
