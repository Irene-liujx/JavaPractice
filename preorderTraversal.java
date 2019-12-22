//144:二叉树的前序遍历
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