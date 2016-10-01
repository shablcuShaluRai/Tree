public class SameTree {

    public boolean sameTree(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        
        return root1.data == root2.data && 
                sameTree(root1.left, root2.left) &&
                sameTree(root1.right, root2.right);
    }
    
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        Node root1 = null;
        root1 = bt.addNode(10, root1);
        root1 = bt.addNode(20, root1);
        root1 = bt.addNode(15, root1);
        root1 = bt.addNode(2, root1);

        Node root2 = null;
        root2 = bt.addNode(10, root2);
        root2 = bt.addNode(20, root2);
        root2 = bt.addNode(15, root2);
        root2 = bt.addNode(2, root2);
        
        SameTree st = new SameTree();
        assert st.sameTree(root1, root2);
        //if  trees are not same then assert will throw an exception
   }
}