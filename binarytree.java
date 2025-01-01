public class binarytree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
        
    }
    
    static class binary{
        static int idx=-1;
        public  node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6};
        binary tree=new binary();
        node root=tree.buildtree(nodes);
        System.out.println(root.data);
    }
}
