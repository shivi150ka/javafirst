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


/*public class divideconquer {
public static void merge(int arr[],int si, int mid, int ei){
    int temp[]=new int[ei-si+1];
    int i=si;
    System.out.println("si"+i);
    int j= mid+1;
    System.out.println("jm"+j);
    int k=0;
    while (i<=mid&&j<=ei) {
        if (arr[i]<arr[j]) {
            temp[k]=arr[i];
            System.out.println("i"+temp[k]);
            i++;
        }
       else{
        temp[k]=arr[j];
        j++;
        System.out.println("j"+temp[k]);
       } 
       k++;
    }
    while (i<=mid) {
        temp[k++]=arr[i++];
    }
    while (j<=ei) {
        temp[k++]=arr[j++];

    }
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}
public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
 }
 public static void mergesort(int arr[],int si,int ei) {
    if (si>=ei) {
       return; 
    }
    int mid=si+(ei-si)/2;
    System.out.println( "mid"+mid);
    mergesort(arr, si, mid);
    mergesort(arr, mid+1, ei);
    merge(arr, si, mid, ei);
 }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergesort(arr,0, arr.length-1);
        printarr(arr);
    }
}*/
public class divideconquer {
public static void merge(int arr[],int si, int end, int mid){
    int temp[]=new int[end-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while (i<=mid && j<=end) {
        if (arr[i]<arr[j]) {
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[i];
            j++;
        }
        k++;
    }
    while (i<=mid) {
        temp[k++]=arr[i++];
    }
    while (j<=end) {
        temp[k++]=arr[j++];
    }
    for(k=0;k<arr.length;k++){
        arr[i]=temp[k];
    }
}
public static void mergesort(int arr[],int si,int end){
    if(si>=end){
        return ;
    }
    int mid=si+(end-si)/2;
    mergesort(arr, si, mid);
    mergesort(arr, mid+1, end);
merge(arr, si, end, mid);
}
    public static void main(String[] args) {
        
    }
}
