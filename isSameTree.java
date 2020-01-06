//100:相同的树  
//给定两个二叉树，编写一个函数来检验它们是否相同。
//如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
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
    public void perorder(TreeNode root,List<Integer> list){
        if(root != null){
            list.add(root.val);
            perorder(root.left,list);
            perorder(root.right,list);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        perorder(root,list);
        return list;
    }
}