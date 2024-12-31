public class divideconquer {
public static void quicksort(int arr[],int si int ei){
    if(si>=ei){
        return;
    }
    int pind=partition(arr,si,ei);
    quicksort(arr, si,pind-1);
    quicksort(arr, pind+1,ei);
}

 public static int partition(int)

    public static void main(String[] args) {
        
    }
}
