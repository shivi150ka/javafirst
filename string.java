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
/*public class string {

    public static void main(String[] args) {
        String substr="abccba";
        System.out.println(substr.length());
        for(int i=0;i<substr.length()/2;i++){
            int j=0,k=substr.length();
            if(substr.charAt(j)==substr.charAt(k)){
                System.out.println("the given string is a palindrome");
            }
            j++;k--;
        }
        System.out.println("not a palindrome");
    }
}*/
/*public class string {
public static int countlowercase(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
if(str.charAt(i))
    }
}
    public static void main(String[] args) {
        String str="AbcEGiJklOp";
    }
}*/
/*public class string
{public static void main(String[] args) 
    {String str="ShradhaDidi";
    String str1="ApnaCollege";
    String str2="ShradhaDidi";
    System.out.println(str.equals(str1) +" "+str.equals(str2));}}*/
    public class string {
    public static boolean ispalindrome(String str){
for(int i=0;i<str.length()/2;i++){
    if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        return false;
    }
}
return true;
    }
        public static void main(String[] args) {
            String str="racecar";
           System.out.println(ispalindrome(str)); 
        }
    }