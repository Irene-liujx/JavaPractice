//101:对称二叉树    给定一个二叉树，检查它是否是镜像对称的。
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSym(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val 
               && isSym(left.left,right.right)
               && isSym(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSym(root.left,root.right);
    }
}