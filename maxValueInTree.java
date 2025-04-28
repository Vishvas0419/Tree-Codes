import java.util.*;
public class maxValueInTree{
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
        }
    }

    public static int findMax(TreeNode root){
        if(root == null) return Integer.MIN_VALUE;
        
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Max value in the tree is: " + findMax(root));
    }
}