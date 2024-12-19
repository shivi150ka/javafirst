/*import java.util.Scanner;
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
}*/
//Bubble Sort
public class sorting {
    public static void bubblesort(int number[]){
        for(int i=0; i<number.length-1;i++)
        {
            for(int j=0; j<number.length-i-1;j++ )
            {
                if(number[j]>number[j+1])
                {
                    int temp = number[j+1];
                    number[j+1]=number[j];
                    number[j]= temp;

                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();}

    public static void main(String[] args) {
        int arr[]={8,5,7,2,4,1};
        bubblesort(arr);
        printarr(arr);
        

    }
}
