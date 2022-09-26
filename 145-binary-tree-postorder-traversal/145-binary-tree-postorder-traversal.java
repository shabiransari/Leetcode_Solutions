/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
         Stack<TreeNode> tempstack=new Stack<>();
        if(root==null)return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode t=stack.pop();
            tempstack.push(t);
            if(t.left!=null){
                stack.push(t.left);
            }
            if(t.right!=null){
                stack.push(t.right);
            }
        }
        while(!tempstack.isEmpty()){
            list.add(tempstack.pop().val);
        }
       return list; 
    }
}