public class arrays2d {
    public static boolean sortedmatrix(int num[][],int key){
        int row=0,col=num[0].length-1;
        while (row<num.length&&col>=0) {
            if(num[row][col]==key){
                System.out.println("found at"+row+col);
                return true;
            
            }
            else if(key<num[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println(" not found"+row+col);
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int key=8;
        sortedmatrix(arr,key);
    }
}
