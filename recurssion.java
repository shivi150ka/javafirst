public class recurssion {
public static int printsum(int n){
    if(n==1){
        return 1;
    }
    printsum(n-1);
    int sum = n + printsum(n-1);
    return sum;

}


    public static void main(String[] args) {
        int num=2;
       
System.out.println( printsum(num));
    }
}
