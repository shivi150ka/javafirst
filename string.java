/*import java.util.Scanner;

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
//System.out.println(fullname.charAt(0));
System.out.println(fullname.length());
for(int i =0;i<fullname.length();i++){
    System.out.print(fullname.charAt(i));
}

        sc.close();
    }
}*/
/*public class string {
public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if (str.charAt(i)==' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
    public static void main(String[] args) {
        String str="Hello world";
       System.out.println(toUpperCase(str)); 
    }
}*/
/*public class string {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(" ");
for(char ch ='a';ch<='z';ch++){
    sb.append(ch);
}
//System.out.println(sb.length());
    }
}*/
public class string {

    public static void main(String[] args) {
        String substr="abccba ";
        for(int i=0;i<substr.length()/2;i++){
            int j=0,k=substr.length();
            if(substr.charAt(j)==substr.charAt(k)){
                System.out.println("the given string is palindrome");
            }
            j++;k--;
        }
        System.out.println("not palindrome");
    }
}
