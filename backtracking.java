/*public class backtracking {
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
}*/

    
public class backtracking {
public static void findsubsets(String stri,String ans, int i){
    //base code
    if (i==stri.length()){
        if(ans.length()==0){
            System.out.println("null");}
            else{
                System.out.println(ans);}
                return;
    }
            findsubsets(stri, ans+stri.charAt(i), i+1);
            findsubsets(stri, ans, i+1);
        }
    

    public static void main(String[] args) {
        String str ="abc";
findsubsets(str,"",0);
    }
}
