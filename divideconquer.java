/*public class divideconquer {
public static void quicksort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int pind=partition(arr,si,ei);
    quicksort(arr, si,pind-1);
    quicksort(arr, pind+1,ei);
}

 public static int partition(int arr[],int si,int ei){
    int pivot=arr[ei]; 
    int i=si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;

 }
 public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }

    public static void main(String[] args) {
        int arr[]={8,9,7,6,5,3,9};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
}*/
public class divideconquer {
public static void mergesort(int arr[],int si, int mid, int ei){
    int temp[]=new int[ei-si-1];
    int i=si;
    int j= mid+1;
    int k=0;
    while (i<=mid&&j<=ei) {
        if (arr[i]<arr[j]) {
            temp[k]=arr[i];
            i++;
        }
       else{
        temp[k]=arr[j];
        j++;
       } 
       k++;
    }
    while (i<=mid) {
        temp[k++]=arr[i++];
    }
    
}
    public static void main(String[] args) {
        
    }
}
