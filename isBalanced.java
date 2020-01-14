//110:平衡二叉树
//给定一个二叉树，判断它是否是高度平衡的二叉树。
//一棵高度平衡二叉树定义为：
//一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
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
    public int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return root == null ? 0 : Math.max(getHeight(root.left),getHeight(root.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(Math.abs(left - right) < 2){
             return isBalanced(root.left) && isBalanced(root.right);
        }
       return false;
    }
}