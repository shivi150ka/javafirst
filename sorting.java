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
/*public class sorting {
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
}*/
//SelectionSort
/*public class sorting{
    public static void selectionsort(int num[]){
        for(int i=0; i<num.length-1;i++){
            int minpos=0;
            for(int j=i+1;j<num.length;j++){
                if(num[j]>num[minpos]){
                    minpos=j;
                }
            
            int temp=num[minpos];
            num[minpos]=num[j];
            num[j]=temp;
        }
    }
}

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,8,7,2};
        selectionsort(arr);
        printarr(arr);
        
        
    }
}*/
//bubble sort
/*public class sorting {
public static void bubblesort(int num[]){
    for(int i=0;i<num.length-1;i++){
        for(int j=0;j<num.length-1-i;j++){
            if(num[j]>num[j+1]){
                int temp=num[j+1];
                num[j+1]=num[j];
                num[j]=temp;
            }
        }
    }
}
public static void printarr(int nums[]){
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+"");
    }
}
    public static void main(String[] args) {
        int arr[]={9,5,7,6,2,8};
        bubblesort(arr);
        printarr(arr);
    }
}*/
public class sorting {
public static void selectionsort(int num[]){
    for(int i=0;i<num.length-1;i++){
        int n=i;
for(int j=i;j<num.length-1;j++){
    if(num[n]>num[j]){
        n=j;
    }
    int temp=num[n];
    num[n]=num[i];
    num[i]=temp;
}
    }
}
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,9,5,1,7};
        selectionsort(arr);
        printarr(arr);
    }
}