import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nam;
        nam = sc.next();
        System.out.println(nam);
String firstname="Shradha" ;

String lastname= "Khapra";
String fullname =firstname+" "+lastname;
System.out.println(fullname);
System.out.println(fullname.charAt(0));
System.out.println(fullname.length());


        sc.close();
    }
}
