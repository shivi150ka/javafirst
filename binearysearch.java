public class binearysearch {
    static class node {
    int data;
    node left;
    node right;
        node(int data){
            this.data=data;
        }
    }
    public static node insert(node root,int key){
        if(root==null){
            root=new node(key);
            return root;
        }
        if(root.data>key){
            root.left=insert(root.left, key);
        }
        else{
            root.left=insert(root.right, key);
        }
return root;
    }
    public static void main(String[] args) {
        int value[]={5,2,7,4,9,3,6};
        node root=null;
        for(int i=0;i<value.length;i++){
            root=insert(root, value[i]);
        }

    }
}
