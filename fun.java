public class function {
    public static void remove(int arr[], int k) {
        int n = arr.length;
        int count = 0;  // Number of elements not equal to k

        // Copy elements not equal to k to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[count] = arr[i];
                System.err.println(arr[count]);
                count++;
            }
        }

        // If no occurrence found
        if (count == n) {
            System.out.println("Element not found");
            return;
        }

        // Print updated array (till new count)
        System.out.println("After removing all " + k + ":");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 4, 5};
        int k = 5;
        remove(arr, k);
    }
}


 
