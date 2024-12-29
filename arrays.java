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
public class arrays {
public static void subarrays(int num[]){
    for(int i=0; i<num.length ;i++){
        int start=i;
for(int j=1;j<num.length;j++){
    int end=j;
for (int k=start;k<=end;k++){
    System.out.print(k);
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
}
