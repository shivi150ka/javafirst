import java.util.Scanner;
import java.util.Arrays;
public class sorting {
public static void inbuiltsort(int numbers[]) {

    Arrays.sort (numbers);
    System.out.print(numbers);
}
public static void printarr(int arr[]){
    for(int i=0; i<arr.length;i++){
        System.out.println(arr[i]+"");
    }
    System.out.println();
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,5,4,8};
        
        inbuiltsort(arr);
        printarr(arr);
        sc.close();

    }
}
