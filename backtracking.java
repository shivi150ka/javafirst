public class backtracking {
public static void changearr(int num[], int index,int val){
if(index==num.length){
    printarr(num);
    return;
}
num[index]=val;
changearr(num, index+1, val+1);
num[index]=num[index]-2;}

public static void printarr(int num[]){
    for (int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        
        int arr[]= new int[5];
        changearr(arr,0,5);
        printarr(arr);
    }
}

    
