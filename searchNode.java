import java.util.*;
public class searchNode {
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
        }
    }
    public static boolean search(TreeNode root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
    
        return search(root.left, key) || search(root.right, key);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(search(root, 4));
    }
}