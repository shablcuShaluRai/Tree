import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class LevelOrderTraversalInReverse {

    public void reverseLevelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        
        q.offer(root);
        //q.add(root);
        while(!q.isEmpty()){
            root = q.poll();
            if(root.right != null){
                q.offer(root.right);
            }
            if(root.left != null){
                q.offer(root.left);
            }
            s.push(root);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop().data + " ");
        }
    }
    
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.addNode(10, root);
        root = bt.addNode(30, root);
        root = bt.addNode(25, root);
        root = bt.addNode(35, root);
        root = bt.addNode(-10, root);
        root = bt.addNode(0, root);
        root = bt.addNode(-20, root);
        root = bt.addNode(-15, root);
        root = bt.addNode(45, root);
        LevelOrderTraversalInReverse rlo = new LevelOrderTraversalInReverse();
        rlo.reverseLevelOrderTraversal(root);
    }
}