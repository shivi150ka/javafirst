/*import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int array[]=new int [50];
        array[0]=sc.nextInt();
        System.out.println(array[0]);
        System.out.println("length of the array =" +array.length);
sc.close();
    }
}*/
/*import java.util.*;
public class arrays {
public static int largest(int num[]){
    int largest =Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        if (largest<num[i]) {
            largest=num[i];
        }
    }
    return largest;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
      System.out.println("largest number is "+ largest(arr)); 
sc.close();
    }
}*/
/*public class arrays {
public static int binearysearch(int num[],int sea){
     int start=0,end=num.length-1;
    System.out.println(num.length);
     while(start<=end){
        int mid=(start+end)/2;
        if(sea==num[mid]){
            return mid;
        }
        if(sea>num[mid]){
start=mid+1;

        }
        else{
            end=mid-1;
        }
      
     }
     return -1;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int key =1;
        System.out.println(arr.length);
      System.out.println( "index is "+binearysearch(arr,key));   
    }
}*/
/*public class arrays {
public static void reverse(int num[]){
    int first=0,last=num.length-1;
    while (first<last) {
        int temp = num[first];
       num [first]= num[last];
       num[last] = temp;
        first++;last--;
    }
    printarr(num);
}
public static void printarr(int array[]){
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]);
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[]={5,9,2,4,7,8};
        printarr(arr);
        reverse(arr);
    }
}*/
/*public class arrays {
public static void subarrays(int num[]){
    for(int i=0; i<num.length ;i++){
        int start=i;
for(int j=i;j<num.length;j++){
    int end=j;
for (int k=start;k<=end;k++){
    
    System.out.print(num[k]);
}
System.out.println();
}
;
    }
}
    public static void main(String[] args) {
        int arr[]={9,5,4,6,3,4,1};
        subarrays(arr);
    }
}*/
/*public class arrays {
public static void pairs(int num[]){
for(int i=0;i<num.length;i++){
    for(int j=i+1;j<num.length;j++){
        System.out.print("("+num[i]+","+num[j]+")");
    }
    System.out.println();
}
System.out.println();
}
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9};
        pairs(arr);
        
    }
}*/
/*public class arrays {
public static void darray(int num[][]){
    int sum=0;
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[0].length;j++){
            if(i==j){
                sum=sum+num[i][j];
            }
        }
    }
    System.out.println("the sum of diagonal element "+sum);
}
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
    {4,5,6},{7,8,9

    }};
    darray(arr);
    }
}*/
/*import java.util.*;
public class arrays {

    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
    }
}
for(int k=0;k<arr.length;k++){
    for(int l=0;l<arr[0].length;l++){
        System.err.print(arr[k][l]);
    }
    System.out.println();
}
sc.close();
    }

}*/
/*public class arrays {

    public static void main(String[] args) {
        int num[]={8,9,7,5,4,1,6};
        int max=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                System.out.println("the smallest element is"+num[i]);
            }
        }

    }
}*/
import java.util.*;
public class arrays {
public static void removestr(String s){
    Stack<Character> st =new Stack<>();
    for(int i=0;i<s.length();i++){
  char ch= s.charAt(i);
  if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='+'||ch=='-'||ch=='*'){
    st.push(ch);
  }
    }
   ArrayList<Character> list = new ArrayList<>();

while(!st.isEmpty()){
    list.add(st.pop());
}

System.out.println(list);  // if you want to see the list

  
}
    public static void main(String[] args) {
              String s="29aA+90bcs-78";
              removestr(s);
    }
}