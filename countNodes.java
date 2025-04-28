public class countNodes {
    static class TreeNode{
        int data;
        TreeNode left, right;
        TreeNode(int value){
            data = value;
            left = right = null;
        }
    }
    public static int countNodes(TreeNode root){
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(countNodes(root) + " nodes in the tree.");
    }
}
