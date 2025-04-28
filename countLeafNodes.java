import java.util.*;

public class countLeafNodes {
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
        }
    }
    public static int countLeafNodes(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(countLeafNodes(root) + " leaf nodes in the tree.");
    }
}
