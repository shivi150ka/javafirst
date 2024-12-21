/*public class recurssion {
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
}*/
/*public class recurssion {
public static int fact(int num){
    if(num==0){
        return 1;
    }
    if(num==1){
        return 1;
    }
    int ans = num*fact(num-1);
    return ans;
}
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}*/
/*public class recurssion {
public static void printinc(int num){
if(num==1){
    System.out.println(1);
    return ;
}
System.out.println(num);
 printinc(num-1);



}
    public static void main(String[] args) {
        int n = 5;
    printinc(n);
    }
}*/
public class recurssion {
public static boolean sortedarr(int ar[] , int i){
    
if(i==ar.length-1){
    return true;}
    if (ar[i]>ar[i+1]){
        return false;
    }
return sortedarr(ar, i+1);
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,5};
        System.out.println(sortedarr(arr,0));
    }
}
