import java.util.*;

public class treeTraversals {
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
        }
    }
    public static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left); 
        postOrder(root.right);  
        System.out.print(root.data + " ");
    }
    public static void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " "); 
        preOrder(root.left); 
        preOrder(root.right);  
    }
    
    public static void levelorder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        System.out.println("Post order traversal: ");
        postOrder(root);
        System.out.println();
        System.out.println("In order traversal: ");
        inOrder(root);
        System.out.println();
        System.out.println("Pre order traversal: ");
        preOrder(root);
        System.out.println();
        System.out.println("Level order traversal: ");
        levelorder(root);
    }
}
