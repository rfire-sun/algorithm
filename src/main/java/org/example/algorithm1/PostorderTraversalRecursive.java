package org.example.algorithm1;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PostorderTraversalRecursive {
    public static void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        // 先遍历左子树
        postorderTraversal(root.left);
        // 访问根节点
        System.out.print(root.val + " ");
        // 再遍历右子树
        postorderTraversal(root.right);
    }

    public static void main(String[] args) {
        // 创建示例二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Postorder Traversal:");
        postorderTraversal(root);  // 输出: 4 5 2 6 7 3 1
    }
}
