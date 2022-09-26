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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> q=new LinkedList<>();
        Stack<List<Integer>> s=new Stack<>();
        q.offer(root);
        while(!q.isEmpty()){
            int x=q.size();
            List<Integer> l=new ArrayList<>();
            while(x-->0){
            TreeNode temp=q.poll();
            l.add(temp.val);
           
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
            }
            s.push(l);
        }
        while(!s.isEmpty()){
            list.add(s.pop());
        }
        return list;
    }
}