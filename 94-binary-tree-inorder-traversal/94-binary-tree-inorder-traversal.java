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
    public List<Integer> inorderTraversal(TreeNode root) {
        //iterative traversal
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Stack<TreeNode> s=new Stack<>();
        TreeNode curr=root;
        while(!s.isEmpty() || curr!=null){
            if(curr!=null){
                s.push(curr);
                curr=curr.left;
            }else{
                curr=s.pop();
                list.add(curr.val);
                curr=curr.right;
            }
        }
        return list;
    }
}