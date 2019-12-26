//102:二叉树的层序遍历    给定一个二叉树，返回其按层次遍历的节点值。
// （即逐层地，从左到右访问所有节点）。
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> mat = new LinkedList<>();
         Queue<TreeNode> queue = new LinkedList<>();
         if(root != null){
             queue.offer(root);
             //层序遍历
             while(!queue.isEmpty()){
                 //取出队列中的全部元素
                 int size = queue.size();
                 //按行数添加
                 List<Integer> rowNode = new ArrayList<>();
                 while(size > 0){
                     TreeNode topNode = queue.poll();
                     rowNode.add(topNode.val);
                     if(topNode.left != null){
                         queue.offer(topNode.left);
                     }
                     if(topNode.right != null){
                         queue.offer(topNode.right);
                     }
                     size--;
                 }
                 mat.add(rowNode);
             }
         }
         return mat;
    }
}